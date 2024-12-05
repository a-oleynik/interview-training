package com.oleynik.interviewtraining.lesson5.filesaving;

import com.oleynik.interviewtraining.lesson5.filesaving.strategies.FileSaveStrategy;
import com.oleynik.interviewtraining.lesson5.filesaving.strategies.FileType;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileHandler<String> fileHandler = new FileHandler<>();
            FileSaveStrategy <String> textFileStrategy = fileHandler.getFileSaveStrategy(FileType.TXT);
            textFileStrategy.save("example.txt", "This is a text file.");

            FileHandler<byte[]> binaryHandler = new FileHandler<>();
            FileSaveStrategy <byte[]> binaryFileStrategy = binaryHandler.getFileSaveStrategy(FileType.BINARY);
            binaryFileStrategy.save("example.bin", new byte[]{1, 2, 3, 4});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
