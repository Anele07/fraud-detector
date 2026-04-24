package com.project.fraud.repository;

import com.project.fraud.db.DatabaseManager;
import com.project.fraud.model.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionRepository {

    public void save(Transaction tx) {

        String sql = "INSERT INTO transactions(id, amount, location, timestamp) VALUES(?,?,?,?)";

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, tx.getId());
            pstmt.setDouble(2, tx.getAmount());
            pstmt.setString(3, tx.getLocation());
            pstmt.setString(4, tx.getTimestamp().toString());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}