package ClassLearnings.AccessModifiers.Test;
// Create singleton pattern, ek hi object ek class ka restriction

public class School_Singelton_Design_Pattern {

    private static School_Singelton_Design_Pattern instance;

    private School_Singelton_Design_Pattern(){}

    public static School_Singelton_Design_Pattern getInstance(){
        if (instance == null){
            instance = new School_Singelton_Design_Pattern();
        }
        return instance;
    }
}
