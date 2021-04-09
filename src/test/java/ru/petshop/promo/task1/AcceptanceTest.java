package ru.petshop.promo.task1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Расчёт доставки. Для обычных клиентов стоимость доставки 250р до 1000р заказа, больше 1000р - бесплатно. Для VIP клиента доставка всегда бесплатная, если заказ больше 2500 р - то скида 5%
 */
class AcceptanceTest {

    final private RestTemplate restTemplate = new RestTemplate();

    public static Stream<Arguments> arrange() {
        return Stream.of(
                Arguments.of("Обычный", 999, 1249),
                Arguments.of("Обычный", 1000, 1000),
                Arguments.of("VIP", 999, 999),
                Arguments.of("VIP", 2499, 2499),
                Arguments.of("VIP", 2500, 2375)
        );
    }

    @Disabled
    @ParameterizedTest
    @MethodSource("arrange")
    void name(String givenClientType, Integer givenCartAmount, Integer expectedOrderAmount) {

        final var actualOrderAmount = restTemplate.getForObject("http://localhost:8080/delivery/" + givenClientType + "/" + givenCartAmount + "/", Integer.class);

        assertEquals(expectedOrderAmount, actualOrderAmount);
    }
}
