package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.FileHandler;

public class Test {
    public static void main(String[] args){
        try {
            BankAccount bankAccount = new BankAccount(200.5);
            bankAccount.withdraw(5000);
        } catch (CustomException e) {
            System.out.println(e);
        }
//        try {
        //FileReader fileReader = new FileReader("a.txt");
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        System.out.println(add(10,20));
//        int add = add(1, 20);
//        System.out.println(add);
//        int[] numerators = {10, 200, 30, 40};
//        int[] denominators = {1, 2, 0, 4};
//        for (int i = 0; i < numerators.length; i++) {
//            System.out.println(divide(numerators[i], denominators[i]));
//
//        }

        // Custom exception
        Integer balance = 20;
        Integer amount = 30;
        try {
            if (balance < amount) {
                throw new InsufficientBalanceException(
                        "Insufficient Balance !!!",
                        new Exception("Invalid balance")
                );
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }

    public static int divide(int n, int d){
        try {
            return n / d;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    public static int add(int a, int b){
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            System.out.println("PRInt - 30");
        }
    }
}
