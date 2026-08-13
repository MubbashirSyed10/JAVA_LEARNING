/*
Problem Statement

Create 3 threads:

Thread 1 prints A
Thread 2 prints B
Thread 3 prints C

The output must always be:

ABCABCABCABC...

For example, if we want 4 repetitions:

ABCABCABCABC

The threads must execute in this order:

Thread A → Thread B → Thread C
              ↓
Thread A → Thread B → Thread C
              ↓
Thread A → Thread B → Thread C
*/

package JavaCodingQuestions;

public class PrintABC3Threads {
    private int turn = 0;
    private final int times = 4;


    public synchronized void printA() throws InterruptedException {
        for (int i = 0; i < times; i++) {
            while (turn != 0) {
                wait();
            }
            System.out.println("A");
            turn = 1;
            notifyAll();
        }
    }

    public synchronized void printB() throws InterruptedException {
        for (int i = 0; i < times; i++) {
            while (turn != 1) {
                wait();
            }
            System.out.println("B");
            turn = 2;
            notifyAll();
        }
    }

    public synchronized void printC() throws InterruptedException {
        for (int i = 0; i < times; i++) {
            while (turn != 2) {
                wait();
            }
            System.out.println("C");
            turn = 0;
            notifyAll();
        }
    }

    public static void main(String[] args) {
        PrintABC3Threads printABC3Threads = new PrintABC3Threads();
        Thread A = new Thread(() -> {
            try {
                printABC3Threads.printA();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread B = new Thread(() -> {
            try {
                printABC3Threads.printB();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread C = new Thread(() -> {
            try {
                printABC3Threads.printC();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        A.start();
        B.start();
        C.start();
    }
}
