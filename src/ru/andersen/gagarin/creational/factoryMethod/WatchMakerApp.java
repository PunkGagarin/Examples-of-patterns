package ru.andersen.gagarin.creational.factoryMethod;

public class WatchMakerApp {
    public static void main(String[] args) {
        Watchmaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static Watchmaker getMakerByName(String maker) {
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();

        throw new RuntimeException("Не поддерживается производственная линия: "+maker);
    }
}
