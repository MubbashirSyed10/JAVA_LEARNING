package Multithreading;

public class ThreadLocal {
    public static void main(String[] args) {
        java.lang.ThreadLocal<String> threadLocal = new java.lang.ThreadLocal<>();


        Thread t1 = new Thread(() -> {
            threadLocal.set("T1 Thread");
            System.out.println(threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            threadLocal.set("T2 Thread");
            System.out.println(threadLocal.get());
        });

        t1.start();
        t2.start();
        System.out.println(threadLocal.get());

    }
}
