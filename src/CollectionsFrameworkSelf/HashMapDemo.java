package CollectionsFrameworkSelf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1, "Musa");
        hashMap.put(2, "Ibrahim");
        hashMap.put(3, "Muhammad");
        hashMap.put(4, "Yusuf");
        hashMap.put(3, "Ismaeel");

        System.out.println(hashMap);

        System.out.println("Map get - " + hashMap.get(3));

        System.out.println("Contains ? " + hashMap.containsKey(5));

        System.out.println(hashMap.keySet());
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(entries);


        Map<String, Integer> map = new HashMap<>();
        map.put("Abu Bakr", 1);
        map.put("Umar", 2);
        map.put("Uthman",  3);
        map.put("Umar", 22);
        System.out.println(map.containsKey("Umar"));
        System.out.println("Map --> " + map);
        System.out.println(map.get("Umar"));
        String s = "asb";
        System.out.println(s.charAt(1));

    }
}
