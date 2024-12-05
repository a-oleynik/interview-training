package com.oleynik.interviewtraining.lesson5.filesaving.strategies;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileSaveStrategy implements FileSaveStrategy<String> {
    @Override
    public void save(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}
