package JavaCodingQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);
        List<Integer> list2 = Arrays.asList(5, 2, 8, 1, 3);
        Collections.sort(list);
        System.out.println(list);

        list2.sort(Comparator.naturalOrder());
        System.out.println(list2);

        List<String> strings = Arrays.asList("Banana", "Apple", "Mango", "Orange");
        List<String> collect = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
