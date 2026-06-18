package CollectionsFrameworkSelf;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // Map<Day, String> map = new HashMap<>();
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY, "Work from office");
        map.put(Day.TUESDAY, "Work from home");
        System.out.println(map);

        // array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing
        // ordinal/index is used
        // FASTER THAN HASHMAP
        // MEMORY EFFICIENT

    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
}
