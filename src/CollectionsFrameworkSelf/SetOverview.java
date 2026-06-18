package CollectionsFrameworkSelf;


import java.util.*;

public class SetOverview {
    public static void main(String[] args) {
        // Set is a collection that cannot contains duplicate elements.
        // Map --> HashMap - LinkedHashMap - TreeMap - EnumMap
        // Set --> HashSet - LinkedHashSet - TreeSet - EnumSet

        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>(); // For the order in which it was added
        Set<Integer> set = new TreeSet<>(); // If you want in sorted order
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(8);
        set.add(7);
        set.add(6);
        set.add(10);
        System.out.println(set);

        // for thread safety.
        Map<String, Integer> map = new HashMap<>();
        map.put("Sunday", 1);
        Map<String, Integer> map1 = Collections.synchronizedMap(map);
        System.out.println(map1);

        // Dont use the above instead use ConcurrentSkipList

    }
}
