package ru.andersen.gagarin.behavioral.Command;

//Надо ли имплементировать интерфейс Command, т.к. мы всё равно будем переопределять метод интерфейса в дочерних классах,
// но так нам не придётся везде явно указывать имплементацию интерфейса
public abstract class AbstractCommand{
    Computer computer;

    public AbstractCommand(Computer computer) {
        this.computer = computer;
    }

}
