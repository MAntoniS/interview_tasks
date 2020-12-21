package com.recruitment.second_task;

import com.recruitment.second_task.interfaces.IFileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile implements IFileReader {

    private String filePath;


    public ReadFile(String path){
        filePath = path;
    }

    @Override
    public String readFile() {
        Path fileName = Path.of(filePath);

        try {
            return Files.readString(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "no such data";
    }
}
