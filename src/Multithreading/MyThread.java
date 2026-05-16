package Multithreading;

public class MyThread extends Thread{

    @Override
    public void run(){
        for (int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " - Priority " + Thread.currentThread().getPriority() + " - count " + i);
            try {
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) throws Exception{
        MyThread t1 = new MyThread();
        t1.setName("Important Thread - 1");
        t1.setPriority(2);
        t1.start();
//        t1.run();
        // t1.join();
        MyThread t2 = new MyThread();
        t2.setName("Very Important Thread");
        t2.setPriority(1);
        t2.start();
    }
}
