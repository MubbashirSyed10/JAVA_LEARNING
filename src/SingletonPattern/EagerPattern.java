package SingletonPattern;

public class EagerPattern {
    private EagerPattern() {}

    private static EagerPattern instance = new EagerPattern();

    public static EagerPattern getInstance() {
        return instance;
    }
}
