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
    }
}
