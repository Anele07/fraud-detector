package com.project.fraud.rules;

import com.project.fraud.FraudResult;
import com.project.fraud.model.Transaction;

public class LargeAmountRule implements FraudRule {

    @Override
    public FraudResult evaluate(Transaction transaction) {

        if (transaction.getAmount() > 10000) {
            return new FraudResult(
                    true,
                    "High amount transaction",
                    50
            );
        }

        return new FraudResult(false, "OK", 0);
    }
}
