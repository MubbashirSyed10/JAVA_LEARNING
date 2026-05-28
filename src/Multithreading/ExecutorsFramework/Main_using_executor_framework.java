package Multithreading.ExecutorsFramework;

import java.util.concurrent.*;

public class Main_using_executor_framework {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Future Runnable implementation
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> 42);
        System.out.println("Future state -> " + future.state());

        System.out.println(future.get());

        if(future.isDone()){
            System.out.println("future is done --- !!!");
        }
//        executorService.shutdown();

        // Callable implementation
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> "Hello";
        Future<String> stringFuture = executorService.submit(callable);
        System.out.println(stringFuture.get());
        if (stringFuture.isDone()){
            System.out.println("String future done");
        }

        executorService.shutdown();

        // How to implement executor
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(20);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });

        }
        System.out.println("Total time taken -> " + (System.currentTimeMillis() - startTime));
        executor.shutdown();
    }

    public static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
