/*
Problem Statement

Write a Java program where:

One thread prints even numbers
Another thread prints odd numbers
Numbers should be printed in correct order
Both threads should work together
Expected Output
1 2 3 4 5 6 7 8 9 10

There are two threads:

Odd Thread  → 1, 3, 5, 7, 9
Even Thread → 2, 4, 6, 8, 10
*/




package JavaCodingQuestions;

public class OddEvenTwoThreads {
    private int number = 1;
    private final int limit = 10;

    public synchronized void printOdd() throws InterruptedException {
        while (number <= limit) {
            while (number % 2 == 0 && number <= limit) {
                wait();
            }

            if (number <= limit) {
                System.out.println("Odd Thread : " + number);
                number++;
                notifyAll();
            }
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (number <= limit) {
            while (number % 2 != 0 && number <= limit) {
                wait();
            }

            if (number <= limit) {
                System.out.println("Even Thread : " + number);
                number++;
                notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        OddEvenTwoThreads printer = new OddEvenTwoThreads();
        Thread Odd = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread Even = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Odd.start();
        Even.start();
    }
}