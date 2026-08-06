package Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0;i < 10; i++){
//            System.out.println("Hello");
//            System.out.println(Thread.currentThread().getName());
        }
        World world = new World();
        world.start();

        WorldRunnable worldRunnable = new WorldRunnable();
        Thread thread = new Thread(worldRunnable);
        thread.start();
        System.out.println(thread.getState());

        world.sleep(500);





        // CHecking thread sleep exception

        ThreadSleepException sleepException = new ThreadSleepException();
        ThreadSleepException sleepException1 = new ThreadSleepException();
        sleepException.start();
        sleepException1.start();
        Thread.sleep(2000);
        System.out.println("CUrrent thread = " +  Thread.currentThread().getName());
        sleepException1.join();
        sleepException.interrupt();

    }
}
