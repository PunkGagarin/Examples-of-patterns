package ru.andersen.gagarin.creational.abstractFactory;

public class AbstractFactoryApp {

    private static DeviceFactory getFactoryByCountryCode(String code) {
        switch (code) {
            case "RU":
                return new RussianFactory();
            case "ENG":
                return new EngFactory();
            default:
                throw new RuntimeException("Unsopported Country Code: " + code);
        }
    }

    //проверка
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("ENG");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();

        mouse.dblclick();
        keyboard.print();
        touchpad.track(195,452);
    }
}
