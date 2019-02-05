package ru.andersen.gagarin.structural.adapter;

//Адаптер перехода от постоянного тока к переменному.
public class ACDC extends DC implements AC {

    public void getPower() {
        getDirectCurrent();
    }
}

//переменный ток
interface AC{
    void getPower();
}

//постоянный ток
class DC{
    void getDirectCurrent(){
        System.out.println("Получаем эл-во");
    }
}

