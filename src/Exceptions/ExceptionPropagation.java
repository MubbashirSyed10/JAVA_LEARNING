package Exceptions;

public class ExceptionPropagation {
 
    public static void main(String[] args) {

        try {
            method3();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void method1() throws Exception {

        System.out.println("Method 1");

        throw new Exception("Something went wrong in Method 1");
    }

    public static void method2() throws Exception {

        method1();

        System.out.println("Method 2");
    }

    public static void method3() throws Exception {

        method2();

        System.out.println("Method 3");
    }
}