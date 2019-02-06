package ru.andersen.gagarin.creational.builder;

public class CarBuilder {
    String nm = "Default";
    Transmission tr = Transmission.MANUAL;
    int sp = 100;

    CarBuilder buildName(String nm){
        this.nm = nm;
        return this;
    }

    CarBuilder buildTransmission(Transmission tr){
        this.tr = tr;
        return this;
    }

    CarBuilder buildMaxSpeed(int sp){
        this.sp = sp;
        return this;
    }

    Car build(){
        Car car = new Car();
        car.setName(nm);
        car.setTran(tr);
        car.setMaxSpeed(sp);
        return car;
    }
}




