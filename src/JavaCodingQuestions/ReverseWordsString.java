package JavaCodingQuestions;

import java.util.Stack;

public class ReverseWordsString {
    public static void main(String[] args) {
        String s = "Java is powerful";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

    public static String reverseWords(String str) {
        String [] words = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!= 0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}