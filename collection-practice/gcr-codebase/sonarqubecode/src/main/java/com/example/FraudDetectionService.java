package com.example;

import java.util.List;

public class FraudDetectionService {

    private final UserService userService;
    private final TransactionRepository repo;

    public FraudDetectionService(UserService userService, TransactionRepository repo) {
        this.userService = userService;
        this.repo = repo;
    }

    public FraudStatus analyze(Transaction tx) {

        if (tx.getAmount() <= 0)
            throw new InvalidAmountException("Amount must be positive!");

        if (userService.isUserBlocked(tx.getUserId()))
            throw new UserBlockedException("User is blocked!");

        List<Transaction> lastTx = repo.getLastTransactions(tx.getUserId(), 1);

        if (lastTx.size() >= 3)
            return FraudStatus.FRAUD;

        if (tx.getAmount() > 50000 && !userService.isUserVerified(tx.getUserId()))
            return FraudStatus.FRAUD;

        String registered = userService.getUserCountry(tx.getUserId());
        if (!tx.getLocation().equalsIgnoreCase(registered))
            return FraudStatus.FRAUD;

        return FraudStatus.SAFE;
    }
}
