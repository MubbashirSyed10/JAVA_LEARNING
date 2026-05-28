package Multithreading.ExecutorsFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> System.out.println("Task executed after 5 seconds of delay"), 5, TimeUnit.SECONDS);

        AtomicInteger count = new AtomicInteger();

        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Task running after every 1 seconds delay");
            count.getAndIncrement();
        }, 10, 1, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown !!! ");
            System.out.println("Counter of scheduled task " + count);
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);

    }
}
