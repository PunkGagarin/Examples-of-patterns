package ru.andersen.gagarin.creational.factoryMethod;

public interface Watchmaker {
    Watch createWatch();
}

class DigitalWatchMaker implements Watchmaker{

    @Override
    public Watch createWatch() {
        return null;
    }
}

class RomeWatchMaker implements Watchmaker{

    @Override
    public Watch createWatch() {
        return null;
    }
}

