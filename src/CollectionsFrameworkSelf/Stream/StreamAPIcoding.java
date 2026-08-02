package CollectionsFrameworkSelf.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIcoding {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Find even numbers from the list
        List<Integer> collect = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println("Find even numbers from the list " + collect);

        // Find Maximum in a List
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("Find Maximum in a List " + max);

        // Sort a list
        List<Integer> sorted = numbers.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sort a list " + sorted);

        // Count Strings with Specific Prefix
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        Long a = names.stream().filter(name -> name.startsWith("A")).count();
        System.out.println("Count Strings with Specific Prefix " + a);


        // Find First Non-Repeated Character in a String

        // Convert List of Strings to Uppercase
        List<String> n = List.of("alice, job, bob, kob");
        List<String> collect1 = n.stream().map(String::toUpperCase).toList();
        System.out.println("Convert List of Strings to Uppercase " + collect1);

        // Sum of Numbers in a List
        List<Integer> sumNumbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = sumNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of Numbers in a List " + sum);


        // Check if Any String Matches a Condition
        // Check if any string in a list contains “API”.
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean api = strings.stream().anyMatch(s -> s.contains("API"));
        System.out.println("Check if Any String Matches a Condition -> " + api);


        // Find Duplicate Elements in a List
        List<Integer> dup = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> set = new HashSet<>();
        Set<Integer> collect2 = dup.stream().filter(num -> !set.add(num)).collect(Collectors.toSet());
        System.out.println("Find Duplicate Elements in a List -> " + collect2);
    }
}
