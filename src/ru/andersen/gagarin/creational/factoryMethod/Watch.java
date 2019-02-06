package ru.andersen.gagarin.creational.factoryMethod;

import java.util.Date;

public interface Watch {
    void showTime();
}

class DigitalWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println("V-XX");
    }
}