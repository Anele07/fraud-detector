package com.project.fraud;

import com.project.fraud.db.DatabaseManager;
import com.project.fraud.engine.FraudEngine;
import com.project.fraud.model.Transaction;
import com.project.fraud.repository.TransactionRepository;
import com.project.fraud.rules.LargeAmountRule;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== FRAUD DETECTION DEMO ===\n");

        DatabaseManager.createTable();
        TransactionRepository repo = new TransactionRepository();

        Transaction tx1 = new Transaction("TX001", 12000, "Cape Town", LocalDateTime.now());
        Transaction tx2 = new Transaction("TX002", 500, "Cape Town", LocalDateTime.now());

        repo.save(tx1);
        repo.save(tx2);

        FraudEngine engine = new FraudEngine(
                List.of(new LargeAmountRule())
        );

        System.out.println("Checking TX001:");
        engine.evaluate(tx1);

        System.out.println("\nChecking TX002:");
        engine.evaluate(tx2);
    }
}