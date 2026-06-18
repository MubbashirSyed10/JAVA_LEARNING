package CollectionsFrameworkSelf;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Java8Demo {
    public static void main(String[] args) {

        // Lambda Expressions
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        thread.start();

        MathOperation sum = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        System.out.println("sum.operate(20, 20) - " + sum.operate(20, 20));

        // Predicate --> Functional interface ( Boolean valued function )
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("isEven.test(3) - " + isEven.test(3));
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println("and.test - " + and.test("Akshay"));


        // Function --> work for you
        // Function
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.andThen(doubleIt).apply(20)); // same
        System.out.println(doubleIt.compose(tripleIt).apply(20)); // same
        System.out.println(doubleIt.apply(100));
        Function<Integer, Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);


        // Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(51);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);



        // Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        // combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

        // BiPredicate, BiConsumer, BiFunction

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));
        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bc"));

        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;


        // Method reference --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("BOB", "ROB", "GOB");
        students.forEach(System.out::println);
    }
}


@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
