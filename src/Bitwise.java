import java.util.Map;

public class Bitwise {
    public static void main(String [] arguments){
        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        if(a != 4){
            System.out.println("true");
        }

        Map<String, String> getenv = System.getenv();
        System.out.println("hell");
        System.out.printf("ssss");
        System.out.println("ge");

        int a1=5;
        int b1=6;
        String sum = "Sum";
        System.out.println(sum + " " + "of" + " a1 " + " & "+ " b1 " + " is " + " : " + (a1+b1));
        System.out.printf("%s of %d & %d is : %d", sum, a1, b1, a1+b1);
    }
}
