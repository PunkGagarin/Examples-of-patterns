package ru.andersen.gagarin.structural.decorator;
//реализации нашего интерфейса
//ДекораторыЮЮ расширяющие наш функционал
class Printer implements PrinterInterface{
    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

class QoutesPrinter extends Decorator{
    PrinterInterface component;

    public QoutesPrinter(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
       super.print();
        System.out.print("\"");
    }
}

class BracketWrapper extends Decorator {
    PrinterInterface component;

    public BracketWrapper(PrinterInterface component) {
        super(component);
    }

    public void print() {
        System.out.print("[");
       super.print();
        System.out.print("]");
    }
}