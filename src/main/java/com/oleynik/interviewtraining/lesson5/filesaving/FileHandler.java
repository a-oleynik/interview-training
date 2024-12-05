package com.oleynik.interviewtraining.lesson5.filesaving;

import com.oleynik.interviewtraining.lesson5.filesaving.strategies.BinaryFileSaveStrategy;
import com.oleynik.interviewtraining.lesson5.filesaving.strategies.FileSaveStrategy;
import com.oleynik.interviewtraining.lesson5.filesaving.strategies.FileType;
import com.oleynik.interviewtraining.lesson5.filesaving.strategies.TextFileSaveStrategy;

public class FileHandler<T> {

    public FileSaveStrategy<T> getFileSaveStrategy(FileType type) {
        return switch (type) {
            case TXT -> (FileSaveStrategy<T>) new TextFileSaveStrategy();
            case BINARY -> (FileSaveStrategy<T>) new BinaryFileSaveStrategy();
            default -> throw new IllegalArgumentException("Unknown file type");
        };
    }
}
