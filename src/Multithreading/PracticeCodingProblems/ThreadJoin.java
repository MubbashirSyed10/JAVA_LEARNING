package Multithreading.PracticeCodingProblems;

public class ThreadJoin {
    public static void main(String[] args) throws Exception {

        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();

        t1.join();

        t2.start();
    }
}


class Task1 extends Thread {

    @Override
    public void run() {

        System.out.println("Task1 Started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 1 Finished");
    }
}

class Task2 extends Thread {

    @Override
    public void run() {

        System.out.println("Thread 2 Started");
    }
}

