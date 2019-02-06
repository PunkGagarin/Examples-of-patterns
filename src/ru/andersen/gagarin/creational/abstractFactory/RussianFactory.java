package ru.andersen.gagarin.creational.abstractFactory;

public class RussianFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}

class RuMouse implements Mouse {

    @Override
    public void clock() {
        System.out.println("Клик мышью");
    }

    @Override
    public void dblclick() {
        System.out.println("Двойной клик");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Листаем вверх");
        else if (direction < 0)
            System.out.println("Листаем вниз");
        else
            System.out.println("Не листаем");
    }

}

class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Печатаем");
    }

    @Override
    public void println() {
        System.out.println("Новая строка");
    }
}

class RuTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Мышь переместилась на "+(deltaX+deltaY)+" пикселей");
    }
}