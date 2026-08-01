package CollectionsFrameworkSelf.Stream;

// String str = "programming";
//p -> 1
//r -> 2
//o -> 1
//g -> 2
//a -> 1
//m -> 2
//i -> 1
//n -> 1

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestOccurenceString {
    public static void main(String[] args) {

        String str = "programming";
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        map.forEach((k,v)->{
            System.out.println(k + " -> " + v);
        });
    }
}
