package com.oleynik.interviewtraining.lesson5.filesaving.strategies;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileSaveStrategy implements FileSaveStrategy<byte[]> {
    @Override
    public void save(String fileName, byte[] content) throws IOException {
        FileOutputStream stream = new FileOutputStream(fileName);
        stream.write(content);
        stream.close();
    }
}
