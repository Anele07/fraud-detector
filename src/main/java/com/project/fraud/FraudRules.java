//package com.project.fraud;
//
//public class FraudRules {
//
//    public FraudResult checkLargeAmount(Transaction tx) {
//
//        if (tx.getAmount() > 10000) {
//            return new FraudResult(
//                    true,
//                    "Large transaction amount detected"
//            );
//        }
//
//        return new FraudResult(false, "OK");
//    }
//}