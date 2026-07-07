package com.example;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    private Feline feline;

    @BeforeEach
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void getFamilyReturnsFelineValue() {
        String expectedFamily = "Кошачьи";
        String actualFamily  = feline.getFamily();
        assertEquals(expectedFamily, actualFamily, "Метод должен вернуть значение 'Кошачьи'");
    }

    @Test
    public void eatMeatReturnsFoodOfPredator() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood, "Метод должен вернуть список \"Животные\", \"Птицы\", \"Рыба\"");
    }

    @Test
    public void getKittensReturnsOneKittenByDefault() {
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount, "Метод должен вернуть значение 1");
    }
}