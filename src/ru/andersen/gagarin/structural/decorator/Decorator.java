package ru.andersen.gagarin.structural.decorator;
//Наш общий декоратор, в который вынесли всё что объединяло наши декораторы.
//Один из комментариев: Уж если Вы реализовали метод void print() в абстрактном классе Decorator,
// то это уже, по сути, не абстрактный класс. Для сохранения структуры паттерна этого не надо было делать.
//Это чушь?
public abstract class Decorator implements PrinterInterface{
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
    }

//    //проверка
//    public static void main(String[] args) {
//        PrinterInterface printer = new BracketWrapper(new QoutesPrinter(new Printer("Something")));
//        printer.print();
//    }

}
