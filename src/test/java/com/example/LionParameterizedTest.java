package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class LionParameterizedTest {
    
    Feline feline = new Feline();

    @ParameterizedTest
    @CsvSource({
        "Самец, true",
        "Самка, false"
        })
    public void doesHaveManeReturnsExpectedValueForSex (String sex, boolean expectedHasMane) throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane, "Метод должен вернуть " + expectedHasMane + " для пола " + sex);
    }
}