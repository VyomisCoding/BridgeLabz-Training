package com.example;

import com.example.FraudStatus;
import com.example.InvalidAmountException;
import com.example.UserBlockedException;
import com.example.Transaction;
import com.example.TransactionRepository;
import com.example.FraudDetectionService;
import com.example.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FraudDetectionServiceTest {

    private UserService userService;
    private TransactionRepository repo;
    private FraudDetectionService service;

    @BeforeEach
    void setup() {
        userService = mock(UserService.class);
        repo = mock(TransactionRepository.class);
        service = new FraudDetectionService(userService, repo);
    }

    private Transaction createTx(double amount, String country) {
        return new Transaction(
                "user1",
                amount,
                country,
                LocalDateTime.now()
        );
    }

    @Test
    void testInvalidAmount() {
        Transaction tx = createTx(0, "India");

        assertThrows(InvalidAmountException.class, () -> service.analyze(tx));
    }

    @Test
    void testUserBlocked() {
        Transaction tx = createTx(100, "India");

        when(userService.isUserBlocked("user1")).thenReturn(true);

        assertThrows(UserBlockedException.class, () -> service.analyze(tx));
    }

    @Test
    void testMoreThan3TransactionsInLastMinute() {
        Transaction tx = createTx(100, "India");

        when(userService.isUserBlocked("user1")).thenReturn(false);
        when(repo.getLastTransactions("user1", 1))
                .thenReturn(List.of(tx, tx, tx));

        FraudStatus status = service.analyze(tx);
        assertEquals(FraudStatus.FRAUD, status);
    }

    @Test
    void testHighAmountUnverifiedUser() {
        Transaction tx = createTx(60000, "India");

        when(userService.isUserBlocked("user1")).thenReturn(false);
        when(repo.getLastTransactions("user1", 1)).thenReturn(List.of());
        when(userService.isUserVerified("user1")).thenReturn(false);

        FraudStatus status = service.analyze(tx);
        assertEquals(FraudStatus.FRAUD, status);
    }

    @Test
    void testDifferentCountryFraud() {
        Transaction tx = createTx(1000, "USA");

        when(userService.isUserBlocked("user1")).thenReturn(false);
        when(repo.getLastTransactions("user1", 1)).thenReturn(List.of());
        when(userService.isUserVerified("user1")).thenReturn(true);
        when(userService.getUserCountry("user1")).thenReturn("India");

        FraudStatus status = service.analyze(tx);
        assertEquals(FraudStatus.FRAUD, status);
    }

    @Test
    void testSafeTransaction() {
        Transaction tx = createTx(1000, "India");

        when(userService.isUserBlocked("user1")).thenReturn(false);
        when(repo.getLastTransactions("user1", 1)).thenReturn(List.of());
        when(userService.isUserVerified("user1")).thenReturn(true);
        when(userService.getUserCountry("user1")).thenReturn("India");

        FraudStatus status = service.analyze(tx);
        assertEquals(FraudStatus.SAFE, status);
    }
}
