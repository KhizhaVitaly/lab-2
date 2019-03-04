package ru.avalon.java.ocpjp.labs.actions;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


/**
 * Действие, которое копирует файлы в пределах дискового
 * пространства.
 */
public class FileCopyAction implements Action{
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        File file = new File("test.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            Path sourcePath = Paths.get("test.txt"), destinationPath = Paths.get("testCopied.txt");
            try {
                Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Action fileCopy = new FileCopyAction();
        fileCopy.start();
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close(){
        /*
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }
}
