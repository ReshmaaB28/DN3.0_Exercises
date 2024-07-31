package Singleton_Pattern;

public class LoggerTest {
    public static void main(String[] args) {
        // Obtain two references to the Logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verify that both references point to the same instance
        System.out.println("Are both Logger instances the same? " + (logger1 == logger2));

        // Log messages using the single instance
        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");
    }
}

