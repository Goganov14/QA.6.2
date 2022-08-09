package ru.neotology.bonus.BonusMilesTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.neotology.bonus.BonusMiles;


public class BonusMilesTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculateForRegisteredOrUnregisteredAndUnderLimitOrOverLimit (String testName, long amount, boolean registered, long expected) {
        BonusMiles service = new BonusMiles();

    }
}
