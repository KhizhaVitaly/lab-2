package ru.avalon.java.ocpjp.labs.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Действие, которое перемещает файлы в пределах дискового
 * пространства.
 */
public class FileMoveAction implements Action {
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №4 Реализуйте метод run класса FileMoveAction
         */
        try {
        Path path = Paths.get("test.txt"), destinationPath = Paths.get("src/test.txt");
            Files.move(path, destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №5 Реализуйте метод close класса FileMoveAction
         */
        Action fileMove = new FileMoveAction();
        fileMove.close();
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

}
