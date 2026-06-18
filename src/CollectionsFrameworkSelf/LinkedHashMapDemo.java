package CollectionsFrameworkSelf;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        linkedHashMap.put("Orange",1);
        linkedHashMap.put("Apple",2);
        linkedHashMap.put("Mango",3);

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
