package com.project.fraud;

import com.project.fraud.db.DatabaseManager;
import com.project.fraud.model.Transaction;
import com.project.fraud.repository.TransactionRepository;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TransactionRepositoryTest {

    @Test
    void shouldSaveTransactionWithoutError() {

        DatabaseManager.createTable();

        Transaction tx = new Transaction(
                "TX999",
                2000,
                "Cape Town",
                LocalDateTime.now()
        );

        TransactionRepository repo = new TransactionRepository();

        assertDoesNotThrow(() -> repo.save(tx));
    }
}