package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.List;
import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    private Feline feline;
    
    private Lion lion;

    @BeforeEach
    public void setUp() throws Exception {
        lion = new Lion(feline, "Самец");
    }

    @Test
    public void lionConstructorThrowsExceptionWhenSexIsNotMaleOrFemale() {
        Exception exception = assertThrows(
            Exception.class, () -> new Lion(feline, "Неизвестный пол")
            );
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedMessage, exception.getMessage(), "Метод должен выбросить исключение с сообщением \"Используйте допустимые значения пола животного - самец или самка\"");
    }

    @Test
    public void getFoodReturnsFoodOfPredator() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood, "Метод должен вернуть список \"Животные\", \"Птицы\", \"Рыба\"");
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getKittensReturnsValueFromFeline() {
        int expectedCount = 3;
        Mockito.when(feline.getKittens()).thenReturn(expectedCount);
        int actualCount = lion.getKittens();
        assertEquals(expectedCount, actualCount, "Метод должен вернуть значение " + expectedCount);
        Mockito.verify(feline).getKittens();
    }
}