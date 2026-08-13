package JavaCodingQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurence {
    public static void main(String[] args) {
        String s = "programming";
        System.out.println(CountOccurence(s));
    }

    public static Map<Character, Integer> CountOccurence(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
