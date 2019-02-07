package ru.andersen.gagarin.behavioral.Command;

public class Computer {
    void start(){
        System.out.println("Начинаем работу");
    }
    void stop(){
        System.out.println("Завершаем работу");
    }
    void reset(){
        System.out.println("Перезагрузка");
    }
}
