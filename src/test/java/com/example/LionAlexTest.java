package com.example;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;

@ExtendWith(MockitoExtension.class)
public class LionAlexTest {

    @Mock
    private Feline feline;

    @Test
    public void getPlaceOfLivingReturnsNewYorkZoo() throws Exception {
        LionAlex alex = new LionAlex(feline);
        String expectedPlace = "Нью-Йоркский зоопарк";
        String actualPlace = alex.getPlaceOfLiving();
        assertEquals(expectedPlace, actualPlace, "Метод должен вернуть 'Нью-Йоркский зоопарк'");
    }

    @Test
    public void getFoodReturnsFoodOfPredator() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        LionAlex alex = new LionAlex(feline);
        List<String> actualFood = alex.getFood();
        assertEquals(expectedFood, actualFood, "Метод должен вернуть список \"Животные\", \"Птицы\", \"Рыба\"");
        Mockito.verify(feline).getFood("Хищник");
    }
}
