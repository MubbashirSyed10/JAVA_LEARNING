package Multithreading.Synchronization;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(c.getCount());

        System.out.println(value());
    }

    public static int value(){
        try {
            return 20;
        }
        finally {
            return 30;
        }
    }
}
