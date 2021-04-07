package ru.petshop.promo.task3;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class ChequeServiceTest {

    @Test
    void createCheque() {
        assertTimeout(Duration.ofMillis(5 * 1000), () -> new ChequeService().createCheque(new ChequeData()));
    }
}
