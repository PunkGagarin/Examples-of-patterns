package ru.andersen.gagarin.creational.builder;

public class CarBuilderApp {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildName("Ferrari")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(400)
                .build();
        System.out.println(car);
    }
}
