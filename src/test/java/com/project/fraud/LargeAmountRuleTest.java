package com.project.fraud;

import com.project.fraud.model.Transaction;
import com.project.fraud.rules.LargeAmountRule;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class LargeAmountRuleTest {

    @Test
    void shouldFlagLargeTransaction() {
        Transaction tx = new Transaction(
                "TX100",
                15000,
                "Cape Town",
                LocalDateTime.now()
        );

        LargeAmountRule rule = new LargeAmountRule();
        FraudResult result = rule.evaluate(tx);

        assertTrue(result.isFraud());
        assertEquals(50, result.getRiskScore());
    }

    @Test
    void shouldNotFlagSmallTransaction() {
        Transaction tx = new Transaction(
                "TX101",
                500,
                "Cape Town",
                LocalDateTime.now()
        );

        LargeAmountRule rule = new LargeAmountRule();
        FraudResult result = rule.evaluate(tx);

        assertFalse(result.isFraud());
        assertEquals(0, result.getRiskScore());
    }
}
