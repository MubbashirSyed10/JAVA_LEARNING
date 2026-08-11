package SingletonPattern;

public class LazyPattern {
    private static LazyPattern instance;

    private LazyPattern() {}

    public static LazyPattern getInstance() {
        if (instance == null) {
            instance = new LazyPattern();
        }
        return instance;
    }
}
