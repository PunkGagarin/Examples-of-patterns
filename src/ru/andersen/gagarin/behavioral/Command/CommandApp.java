package ru.andersen.gagarin.behavioral.Command;

public class CommandApp {
    public static void main(String[] args) {

        Computer comp = new Computer();
        User us = new User(new StartCommand(comp),
                            new StopCommand(comp),
                            new ResetCommand(comp));

        us.startComputer();
        us.stopComputer();
        us.resetComputer();
    }
}
