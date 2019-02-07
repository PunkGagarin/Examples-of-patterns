package ru.andersen.gagarin.behavioral.Observer;

public class MeteoStationApp {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        station.add(new ConsoleObserver());
        station.add(new FileObserver());
        station.setMeasurements(18, 760);
        station.setMeasurements(30, 400);
    }
}
