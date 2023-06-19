package com.codecool.musiclibrary.ui;
import com.codecool.musiclibrary.ui.Logger;
import com.codecool.musiclibrary.ui.ConsoleLogger;
import com.codecool.musiclibrary.ui.FileLogger;
public class LoggerTest {
    public static void main(String[] args) {
        // Test ConsoleLogger
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.LogInfo("This is an informational message.");
        consoleLogger.logError("This is an error message.");

        // Test FileLogger
        Logger fileLogger = new FileLogger("log.txt");
        fileLogger.LogInfo("This is an informational message.");
        fileLogger.logError("This is an error message.");
    }
}