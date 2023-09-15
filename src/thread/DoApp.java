package thread;

public class DoApp {
    public static void main(String[] args) {
        Runnable runner = () -> System.out.println("Tokyo");
        runner.run();
        start(() -> greetMessage("Osaka"));
        start(() -> greetMessage("Yokohama", "Hello"));
        }
        public static void greetMessage(String message) {
        System.out.println(message);
        }
        public static void greetMessage(String message, String prefix) {
        System.out.println(prefix + ", " + message);
        }
        public static void start(Runnable r) {
        r.run();
        }
}
