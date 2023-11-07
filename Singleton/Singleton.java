package Singleton;
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        int x = 1;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
