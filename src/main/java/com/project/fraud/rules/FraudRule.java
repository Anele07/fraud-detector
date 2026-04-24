package com.project.fraud.rules;

import com.project.fraud.FraudResult;
import com.project.fraud.model.Transaction;

public interface FraudRule {
    FraudResult evaluate(Transaction transaction);
}
