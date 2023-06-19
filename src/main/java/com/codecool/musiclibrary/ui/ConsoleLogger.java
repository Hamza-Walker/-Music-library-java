package com.codecool.musiclibrary.ui;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger{
    @Override
    public void LogInfo(String message) {
        logMessage(message, "INFO");
    }

    @Override
    public void logError(String message) {
        logMessage(message, "ERROR");

    }

    private void logMessage(String message, String type){
        String entry = "[" + LocalDateTime.now() + "] " + type + ": " + message;
        System.out.println(entry);
    }
}
