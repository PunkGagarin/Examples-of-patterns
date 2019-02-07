package ru.andersen.gagarin.behavioral.Command;
//invoker(тот, кто работает с интерфейсом)
public class User {
    private Command start;
    private Command stop;
    private Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startComputer(){
        start.execute();
    }
    void stopComputer(){
        stop.execute();
    }
    void resetComputer(){
        reset.execute();
    }
}
