package ru.andersen.gagarin.structural.facade;
//класс Computer - это Фасад, т.е он скрывает всю сложную реализацию за простым интерфейсом.

public class Computer {
    private Power power = new Power();
    private DVDRom rom = new DVDRom();
    private HDD hdd = new HDD();

    public void copy(){
        power.on();
        rom.load();
        hdd.copyFromDvd(rom);
    }
}


class Power{
    void on(){
        System.out.println("Turning on");
    }
    void off(){
        System.out.println("Turning off");
    }
}

class DVDRom{
    private boolean data = false;
    public boolean hasData(){
        return data;
    }

    void load(){
        data = true;
    }
    void unload(){
        data = false;
    }
}

class HDD{
    void copyFromDvd(DVDRom dvd){
        if(dvd.hasData()){
            System.out.println("Copying data from DVD");
        }
        else {
            System.out.println("Please, insert DVD");
        }
    }
}
