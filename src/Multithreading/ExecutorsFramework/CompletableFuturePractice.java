package Multithreading.ExecutorsFramework;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturePractice {
    public static void main(String[] args) {
        CompletableFuture<String> order = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Order Placed !";
        });
        order.thenAccept(System.out::println);
        order.join();


        CompletableFuture<String> cart = CompletableFuture.supplyAsync(() -> {
            return "Added to Cart.";
        });
        CompletableFuture<String> choosePaymentMode = CompletableFuture.supplyAsync(() -> {
            return "Payment mode selected. Proceeding for the Payment. ";
        });
        CompletableFuture<String> PaymentDone= CompletableFuture.supplyAsync(() -> {
            try{
                Thread.sleep(4000);
                return "Payment Done";
            } catch (InterruptedException e) {
                return "Payment Failed.";
            }
            finally {
                System.out.println("Closing the session");
            }
        });

        CompletableFuture.allOf(cart, choosePaymentMode, PaymentDone);
        System.out.println(cart.join());
        System.out.println(choosePaymentMode.join());
        System.out.println(PaymentDone.join());
    }
}
