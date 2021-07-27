public class App {

    public static void main(String[] args) {
        // adaptor through composition
        ConsoleLogWriter logWriter = new ConsoleLogWriter();
        Logger logger = new Logger(logWriter);

        logger.write("Hello there.");

        // adaptor through inheritance
        ConsoleLogWriter2 logWriter2 = new ConsoleLogWriter2();
        Logger logger2 = new Logger(logWriter2);

        logger2.write("Hi there 2.");
    }
}
