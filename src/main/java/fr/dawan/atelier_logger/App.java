package fr.dawan.atelier_logger;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        try {
            logger.log("Test du logger");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
