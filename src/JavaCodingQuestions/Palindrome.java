package JavaCodingQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        String k = "delhi";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(k));
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
