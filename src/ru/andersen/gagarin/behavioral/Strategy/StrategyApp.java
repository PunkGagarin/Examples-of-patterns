package ru.andersen.gagarin.behavioral.Strategy;

public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient c = new StrategyClient();

        int[] arr0 = {1,4,3,2,1};
        c.setStrategy(new SelectionSort());
        c.executeStrategy(arr0);

        int[] arr1 = {70,3,15,5,22,23,99};
        c.setStrategy(new InsertingSort());
        c.executeStrategy(arr1);

        int[] arr2 = {70,3,15,5,22,23,99};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr2);
    }
}
