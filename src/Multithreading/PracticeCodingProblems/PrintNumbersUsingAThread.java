package Multithreading.PracticeCodingProblems;

public class PrintNumbersUsingAThread {
    public static void main(String[] args) {
        // Question 1 - Print Numbers Using a Thread
        MyThreadPractice myThread = new MyThreadPractice();
        myThread.setName("MyThreadPractice");
        myThread.start();
//        myThread.run();

    }
}

class MyThreadPractice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
