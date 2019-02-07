package ru.andersen.gagarin.behavioral.Observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

//подписчик это не человек, который получает почту, а сервис, который эту почту отправляет,
// т.е. тот - кто ОБРАБАТЫВАЕТ наблюдаемое событие.
public interface Observer {
    void handleEvent(int tmp, int pres);
}

class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int tmp, int pres) {
        System.out.println("Погода изменилась. Температура = " + tmp + ", Давление = " + pres + ".");
    }
}

class FileObserver implements Observer {
    @Override
    public void handleEvent(int tmp, int pres) {
        File f;
        try {
            f = File.createTempFile("TempPressure", "_txt");
            PrintWriter pw = new PrintWriter(f);
            pw.write("Погода изменилась. Температура = " + tmp + ", Давление = " + pres + ".");
            pw.println();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}