package ru.andersen.gagarin.structural.delegate;

public interface Graphic {
    void draw();
}

class Triangle implements Graphic{

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник.");
    }
}

class Square implements Graphic{

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат.");
    }
}

class Circle implements Graphic{

    @Override
    public void draw() {
        System.out.println("Рисуем круг.");
    }
}