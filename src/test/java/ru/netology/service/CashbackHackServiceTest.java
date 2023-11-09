package ru.netology.service;



public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain600() {    //метод

        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int actual = service.remain(amount);
        int expected = 400;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remain999() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        org.junit.Assert.assertEquals(expected, actual);
    }


    @org.junit.Test
    public void remain1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;     //

        org.junit.Assert.assertEquals(expected, actual);
    }
}