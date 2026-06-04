package Multithreading.ExecutorsFramework;

import java.util.concurrent.*;

public class ExecutorServiceProblem {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        Future<String> future1 = executorService.submit(new DependentService());
//        Future<String> future2 = executorService.submit(new DependentService());
//        Future<String> future3 = executorService.submit(new DependentService());
//
//        future1.get();
//        future2.get();
//        future3.get();
//
//        System.out.println("All dependent services finished. Starting main service ...");
//        executorService.shutdown();

        // To avoid the above problem we will be using countdownlatch ...

        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();

        System.out.println("Main --- ");
        executorService.shutdown();

        // To reuse countdownlatch we can use cyclic barrier

    }
}

class DependentService implements Callable<String> {
    private final CountDownLatch latch;

    DependentService(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " Service Started !!! ");
            Thread.sleep(2000);
        } finally {
            latch.countDown();
        }
        return "OKAY";
    }
}

