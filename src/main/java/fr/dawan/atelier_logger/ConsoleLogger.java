package fr.dawan.atelier_logger;

public class ConsoleLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.printf("[Log] %s\n", message);
    }
}
