package CollectionsFrameworkSelf.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().filter(n -> n % 2 == 0).map(n -> n + 1.5f).forEach(System.out::println);

        // Old method
        int count = 0;
        for (int i : numbers){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("COunter without stream " + count);
        // Using streams
        long count1 = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Counter with stream - " + count1);


        //// Creating Streams
        // 1. From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        // 2. From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);
        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b");
        // 4. Infinite streams
        Stream.generate(() -> 1);
        Stream.iterate(1, x -> x + 1);


        //Example 1 - Collecting names by length

        List<String> list1 = Arrays.asList("Zaid", "Umar", "Uthman", "Ibrahim", "Esa", "Abdullah");
        Map<Integer, List<String>> collect = list1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Collect with grouping - " + collect);

        // Example 2 - Counting word occurences
        String sentence = "hello world hello java world";
        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.printf(words.stream().collect(Collectors.groupingBy(String::length)).toString());
    }
}
