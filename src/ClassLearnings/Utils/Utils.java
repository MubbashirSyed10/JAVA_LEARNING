package ClassLearnings.Utils;

public class Utils {
    public static String trimAndUppercase(String str){
        if(str != null){
            str = str.trim().toUpperCase();
        }
        return str;
    }

    @Override
    public String toString() {
        return "Utils" + "My Name is " + super.toString();
    }

    public static final double PI = 3.14159;
}
