package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;

public class FileDeleteAction implements Action{

    @Override
    public void close() throws Exception {

    }

    @Override
    public void run() {
        File file = new File("test.txt");
        if(file.exists())
            file.delete();
        else
            System.out.println("File doesn't exist");
    }
}
