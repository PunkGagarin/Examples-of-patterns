package ru.andersen.gagarin.creational.abstractFactory;

public class EngFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new EngMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EngKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EngTouchpad();
    }
}

class EngMouse implements Mouse {

    @Override
    public void clock() {
        System.out.println("Mouse click");
    }

    @Override
    public void dblclick() {
        System.out.println("Double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Scrolling up");
        else if (direction < 0)
            System.out.println("Scrolling down");
        else
            System.out.println("Not scrolling");
    }

}

class EngKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void println() {
        System.out.println("New line");
    }
}

class EngTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Mouse moved on "+(deltaX+deltaY)+ " pixels");
    }
}
