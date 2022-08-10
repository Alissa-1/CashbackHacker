package ru.netology.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalcCashBackIfOverTheBound() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;
        int expected = 600;
        int actual = service.remain(amount);
        assertEquals(expected, actual, "WRONG!");
    }

    @Test
    public void shouldCalcCashBackIfUnderTheBound() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int expected = 700;
        int actual = service.remain(amount);
        assertEquals(expected, actual, "WRONG!");
    }

    @Test
    public void shouldCalcCashBackIfOnTheBound() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual, "WRONG!");
    }
}
