package SingletonPattern;

public class DoubleCheckedPattern {
    private static volatile DoubleCheckedPattern instance;

    private DoubleCheckedPattern() {}

    public static DoubleCheckedPattern getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedPattern.class) {
                if (instance == null) {
                    instance = new DoubleCheckedPattern();
                }
            }
        }
        return instance;
    }
}
