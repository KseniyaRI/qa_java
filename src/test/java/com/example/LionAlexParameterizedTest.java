package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class LionAlexParameterizedTest {

    Feline feline = new Feline();

    @ParameterizedTest
    @CsvSource({
        "Марти, true",
        "Глория, true",
        "Мелман, true",
        "Кермит, false"
    })
    public void getFriendsContainsExpectedFriend(String name, boolean expected) throws Exception {
        LionAlex alex = new LionAlex(feline);
        boolean actual = alex.getFriends().contains(name);
        assertEquals(expected, actual, "Метод должен вернуть " + expected + " для имени " + name);
    }
}