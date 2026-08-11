package SingletonPattern;

public class SynchronizedPattern {
    private static SynchronizedPattern instance;

    private SynchronizedPattern() {

    }

    public static synchronized SynchronizedPattern getInstance() {
        if (instance == null) {
            instance = new SynchronizedPattern();
        }
        return instance;
    }
}
