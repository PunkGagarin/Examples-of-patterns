package ru.andersen.gagarin.creational.builder;

public class Car {
    String name;
    Transmission tran;
    int maxSpeed;

    public void setName(String name) {
        this.name = name;
    }

    public void setTran(Transmission tran) {
        this.tran = tran;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", tran=" + tran +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
enum Transmission{
    AUTO, MANUAL
}