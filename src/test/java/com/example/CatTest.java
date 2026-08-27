package com.example;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class CatTest {
    
    private Cat cat;

    @Mock
    private Feline feline;

    @BeforeEach
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnsCatSound() {
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound, "Метод должен вернуть значение 'Мяу'");
    }

    @Test
    public void getFoodReturnsFoodOfPredator() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood, "Метод должен вернуть список \"Животные\", \"Птицы\", \"Рыба\"");
        Mockito.verify(feline).eatMeat();
    }
}