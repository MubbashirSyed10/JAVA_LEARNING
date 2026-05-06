package ClassLearnings.Utils;

public class Utils {
    public static String trimAndUppercase(String str){
        if(str != null){
            str = str.trim().toUpperCase();
        }
        return str;
    }

    public static final double PI = 3.14159;
}
