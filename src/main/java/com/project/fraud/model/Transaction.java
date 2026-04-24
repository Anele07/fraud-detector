package com.project.fraud.model;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private double amount;
    private String location;
    private LocalDateTime timestamp;

    public Transaction(String id, double amount, String location, LocalDateTime timestamp) {
        this.id = id;
        this.amount = amount;
        this.location = location;
        this.timestamp = timestamp;
    }

    public String getId() { return id; }
    public double getAmount() { return amount; }
    public String getLocation() { return location; }
    public LocalDateTime getTimestamp() { return timestamp; }
}