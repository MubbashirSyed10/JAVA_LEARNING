package Multithreading.PracticeCodingProblems;

public class TwoThreads {
    public static void main(String[] args) {
        IntThread a = new IntThread();
        CharThread b = new CharThread();
        a.run();
        b.run();

    }
}

class IntThread implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class CharThread implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(c);
        }
    }
}
