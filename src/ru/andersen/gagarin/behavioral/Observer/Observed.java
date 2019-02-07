package ru.andersen.gagarin.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Observed {
    void add(Observer o);

    void remove(Observer o);

    void notifyObservers();
}

class MeteoStation implements Observed {
    int temperature;
    int pressure;

    List<Observer> list = new ArrayList<>();

    public void setMeasurements(int t, int p){
        temperature = t;
        pressure = p;
        notifyObservers();
    }

    @Override
    public void add(Observer o) {
        list.add(o);
    }

    @Override
    public void remove(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : list)
            o.handleEvent(temperature, pressure);
    }
}
