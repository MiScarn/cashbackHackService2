package ru.netology.service;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remain600() {    //метод

        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void remain999() {    //метод

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void remain1000() {    //метод

        CashbackHackService service = new CashbackHackService();   // сумма покупки 1000 рублей, начисляется кэшбэк
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;     //

        assertEquals (actual, expected);
    }
}

