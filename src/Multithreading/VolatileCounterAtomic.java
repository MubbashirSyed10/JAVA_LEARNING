package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounterAtomic {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCounterAtomic counterAtomic = new VolatileCounterAtomic();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counterAtomic.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counterAtomic.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counterAtomic.getCounter());

    }
}
