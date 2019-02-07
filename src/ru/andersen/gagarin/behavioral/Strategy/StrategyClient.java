package ru.andersen.gagarin.behavioral.Strategy;

public class StrategyClient {
    Sorting strategy;
    public void setStrategy(Sorting strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(int[] arr){
        strategy.sort(arr);
    }
}

interface Sorting{
    void sort(int[] arr);
}
