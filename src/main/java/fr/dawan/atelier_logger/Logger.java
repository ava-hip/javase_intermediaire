package fr.dawan.atelier_logger;

import com.mysql.cj.log.Log;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Logger {
    private static volatile Logger instance;

    private ILogger log;

    private Logger() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("log.properties"));
            switch (properties.getProperty("typelogger")) {
                case "file":
                    log = new FileLogger();
                    break;
                    default:
                        log = new ConsoleLogger();
            }
        } catch (IOException e) {
            log = new ConsoleLogger();
        }
    }

    public static synchronized Logger getInstance() {
        if(instance==null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) throws Exception {
        log.log(message);
    }

}
