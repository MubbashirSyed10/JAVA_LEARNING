package Multithreading;

public class MyDaemon extends Thread{
    @Override
    public void run() {

        while(true) {
            System.out.println("Daemon running");

            try {
                Thread.sleep(1000);
            } catch(Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        MyDaemon t = new MyDaemon();
        t.setDaemon(true);
        t.start();
        System.out.println("Main thread finished");
    }
}
