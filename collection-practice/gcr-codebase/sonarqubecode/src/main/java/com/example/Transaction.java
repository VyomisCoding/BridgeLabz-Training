package com.example;

import java.time.LocalDateTime;

public class Transaction {
    private String userId;
    private double amount;
    private String location;
    private LocalDateTime timestamp;

    public Transaction(String userId, double amount, String location, LocalDateTime timestamp) {
        this.userId = userId;
        this.amount = amount;
        this.location = location;
        this.timestamp = timestamp;
    }

    public String getUserId() { return userId; }
    public double getAmount() { return amount; }
    public String getLocation() { return location; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
