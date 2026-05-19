package Multithreading.Locks;

public class Main {
    public static void main(String[] args) {
        BankAccount SBI = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                SBI.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        try {
            t1.start();
            Thread.sleep(10000);
            t2.start();
            Thread.sleep(10000);
        } catch (Exception e){
            System.out.println(e);
        }


    }
}
