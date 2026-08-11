package JavaCodingQuestions;

public class StringsCoding {
    public static void main(String[] args) {

        // Reverse words in the string
        String s = "Hello World";
        StringBuffer sb = new StringBuffer();
        String[] words = s.trim().split("\\s+");

        for(int i = words.length - 1; i >= 0; i--){
            if(sb.length()>0){
                sb.append(' ');
            }
            sb.append(words[i]);
        }
        System.out.println(sb);




    }
}
