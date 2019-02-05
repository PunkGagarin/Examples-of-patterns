package ru.andersen.gagarin.structural.delegate;

//какой поход лучше? Создаётся одинаковое количество объектов,
//в нашем классе они удаляются при первом проходе GC, т.к. на них нет ссылок.
public class MyPainter {
    public void drawCircle(){
        new Circle().draw();
    }

    public void drawSquare(){
        new Square().draw();
    }

    public void drawTriangle(){
        new Triangle().draw();
    }
}
