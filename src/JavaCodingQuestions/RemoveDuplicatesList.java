package JavaCodingQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3);
        // Using stream API
//        System.out.println(list.stream().distinct().toList());
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println(list);
        System.out.println(set);
    }
}
