package com.example;

import java.util.List;

public interface TransactionRepository {
    List<Transaction> getLastTransactions(String userId, int minutes);
}
