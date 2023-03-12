package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountIs900() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNull() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1IfAmountIs999() {
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999IfAmountIs1() {
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000IfAmountIs0() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmountIs500() {
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}

