package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;

public class CreateFolderAction implements Action{
    @Override
    public void close() throws Exception {

    }

    @Override
    public void run() {
        File file = new File("TestFolder");
        if(!file.exists())
            file.mkdir();
        else
            System.out.println("Folder already exists");
    }
}
