package CollectionsFrameworkSelf;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Orange",1);
        hashMap.put("Apple",2);
        hashMap.put("Mango",3);

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
