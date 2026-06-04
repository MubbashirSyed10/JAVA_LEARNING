package Multithreading;

class SharedObj {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
        System.out.println("Flag was made true by writerthread");
    }

    public void printIfFlagTrue(){
        while (!flag){
            // do nothing
        }
        System.out.println("Flag is true ");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedObj obj = new SharedObj();
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            obj.setFlagTrue();
            System.out.println("Flag was made true by - " + Thread.currentThread().getName());
        });

        Thread readerThread = new Thread(() -> {
            obj.printIfFlagTrue();
        });

        writerThread.start();
        readerThread.start();
    }
}
