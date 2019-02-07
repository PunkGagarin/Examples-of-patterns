package ru.andersen.gagarin.behavioral.Command;

//interface command
public interface Command {
    void execute();
}

//concrete command
class StartCommand extends AbstractCommand implements Command {
    public StartCommand(Computer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.start();
    }
}

class StopCommand extends AbstractCommand implements Command {
    public StopCommand(Computer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.stop();
    }
}

class ResetCommand extends AbstractCommand implements Command {
    public ResetCommand(Computer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.reset();
    }
}


