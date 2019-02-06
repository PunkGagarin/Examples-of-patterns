package ru.andersen.gagarin.creational.abstractFactory;

interface Mouse {
    void clock();

    void dblclick();

    void scroll(int direction);
}

interface Keyboard {
    void print();
    void println();
}

interface Touchpad{
    void track(int deltaX, int deltaY);
}

interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
