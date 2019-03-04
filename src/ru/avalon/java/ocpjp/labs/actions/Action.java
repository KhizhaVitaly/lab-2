package ru.avalon.java.ocpjp.labs.actions;

import java.io.*;

/**
 * Абстрактное представление о действии, как функциональном
 * элементе приложения.
 * <p>
 * Действие является потоковым объектом, что позволяет
 * исполнять несколько действий параллельно и не блокировать
 * основной поток исполнения.
 */
public interface Action extends Runnable, AutoCloseable {


    /**
     * Запускает потоковый объект на исполнение в отдельном
     * потоке исполнения.
     */
    default void start() {

        /*
         * TODO №1 Реализуйте метод start интерфейса Action.
         */
        Runnable runnable = new Action() {
            @Override
            public void close() throws Exception {

            }

            @Override
            public void run() {

            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //throw new UnsupportedOperationException("Not implemented yet!");
    }
    
}
