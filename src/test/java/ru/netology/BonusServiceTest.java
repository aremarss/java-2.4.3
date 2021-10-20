package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldCalculate(String test, long amount, boolean registered, long expected) {

        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}