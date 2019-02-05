package ru.andersen.gagarin.structural.adapter;

//пример через композицию
class Adpater extends DC implements AC{

    private DC dc = new DC();

    public void getPower() {
        dc.getDirectCurrent();
    }
}
