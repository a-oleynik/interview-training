package com.oleynik.interviewtraining.lesson5.filesaving.strategies;

import java.io.IOException;

public interface FileSaveStrategy <T> {
    void save(String fileName, T content) throws IOException;
}
