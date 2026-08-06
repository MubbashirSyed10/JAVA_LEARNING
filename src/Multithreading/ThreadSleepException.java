package Multithreading;

class ThreadSleepException extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Sleeping...");
            Thread.sleep(10000);
            System.out.println("Finished Sleeping");
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }
}
