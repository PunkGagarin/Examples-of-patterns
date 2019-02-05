package ru.andersen.gagarin.structural.delegate;

public class A {
    void doSmth(){
        //do smth
    }
}

class B{
    A a = new A();
    void doSmth(){
        a.doSmth();
    }
}