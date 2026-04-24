package com.project.fraud.engine;

import com.project.fraud.FraudResult;
import com.project.fraud.model.Transaction;
import com.project.fraud.rules.FraudRule;

import java.util.List;

public class FraudEngine {

    private final List<FraudRule> rules;

    public FraudEngine(List<FraudRule> rules) {
        this.rules = rules;
    }

    public void evaluate(Transaction transaction) {

        int totalRisk = 0;
        StringBuilder reasons = new StringBuilder();

        for (FraudRule rule : rules) {
            FraudResult result = rule.evaluate(transaction);

            totalRisk += result.getRiskScore();

            if (result.getRiskScore() > 0) {
                reasons.append(result.getReason()).append("; ");
            }
        }

        System.out.println("Total Risk Score: " + totalRisk);
        System.out.println("Reasons: " + reasons);

        if (totalRisk >= 50) {
            System.out.println("STATUS: FRAUDULENT TRANSACTION");
        } else {
            System.out.println("STATUS: CLEAN");
        }
    }
}
