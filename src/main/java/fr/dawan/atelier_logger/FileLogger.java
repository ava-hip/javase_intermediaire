package fr.dawan.atelier_logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements ILogger{
    @Override
    public void log(String message) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("application.log", true)))
        {
            bw.write("[Log] " + message + "\n");
        }
    }
}
