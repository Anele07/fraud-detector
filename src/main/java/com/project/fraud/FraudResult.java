package com.project.fraud;

public class FraudResult {

    private boolean fraud;
    private String reason;
    private int riskScore;

    public FraudResult(boolean fraud, String reason, int riskScore) {
        this.fraud = fraud;
        this.reason = reason;
        this.riskScore = riskScore;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getReason() {
        return reason;
    }

    public int getRiskScore() {
        return riskScore;
    }
}
