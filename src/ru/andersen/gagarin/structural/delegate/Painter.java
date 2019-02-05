package ru.andersen.gagarin.structural.delegate;

public class Painter {
    Graphic graphics;

    //этот метод называется мутатор
    void setGraphics(Graphic g){
        graphics = g;
    }

    public void draw(){
        graphics.draw();
    }
/*
пример:
    public static void main(String[] args) {
        Painter p = new Painter();
        p.setGraphics(new Square());
        p.draw();
    }
*/
}
