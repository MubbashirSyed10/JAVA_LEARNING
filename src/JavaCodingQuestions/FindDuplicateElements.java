package JavaCodingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 2, 4, 5, 1, 6, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> duplicates = new HashSet<>();
        for(Map.Entry<Integer, Integer> i :  map.entrySet()){
            if(i.getValue() > 1){
                duplicates.add(i.getKey());
            }
        }

        System.out.println(duplicates);
    }
}
