package ru.andersen.gagarin.behavioral.Strategy;

import java.util.Arrays;

public class InsertingSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка вставками");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int index = barrier;
            while (index - 1 >= 0 && arr[index] < arr[index - 1]) {
                int tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }
        System.out.println("После:\t" + Arrays.toString(arr) + "\n");
    }
}
