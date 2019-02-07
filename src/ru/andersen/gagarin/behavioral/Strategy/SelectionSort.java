package ru.andersen.gagarin.behavioral.Strategy;

import java.util.Arrays;

public class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка пузырьком");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int i = barrier; i < arr.length; i++) {
                if (arr[i] < arr[barrier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
        System.out.println("После:\t" + Arrays.toString(arr)+"\n");
    }
}
