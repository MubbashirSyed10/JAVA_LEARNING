package Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock(true);

    public void withdraw(int amount){
//        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName() + " Proceeding with withdrawal");
//            Thread.sleep(10000);
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining balance : " + balance);
//        }else {
//            System.out.println(Thread.currentThread().getName() + " Insufficient Balance ");
//        }





        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
        try {
            if (lock.tryLock(10000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName() + "LOCK Applied ! ");
                if (balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " Proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining balance : " + balance);
                    }
                    catch (Exception e){
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance ");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " Could not acquire lock, will try again later.");
            }
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
