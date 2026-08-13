package SingletonPattern;

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);


        System.out.println(s1.equals(s2));
        System.out.println(s1 == s1);

        DoubleCheckedPattern doubleCheckedPattern = DoubleCheckedPattern.getInstance();
        System.out.println(doubleCheckedPattern);
    }
}
