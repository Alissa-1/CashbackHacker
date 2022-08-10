package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalcCashBackIfOverTheBound() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;
        int expected = 600;
        int actual = service.remain(amount);
        assertEquals("WRONG!", expected, actual);
    }

    @Test
    public void shouldCalcCashBackIfUnderTheBound() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int expected = 700;
        int actual = service.remain(amount);
        assertEquals("WRONG!", expected, actual);
    }

    @Test
    public void shouldCalcCashBackIfOnTheBound() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals("WRONG!", expected, actual);
    }
}