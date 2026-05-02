//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
//        System.out.println(args[0]);
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        int a  = 10;
        modifyInt(a);
        System.out.println("A value is " + a);

        User user = new User();
        user.name = "Zaid";
        modifyString(user);

        System.out.println("User name value is "+ user.name);

        B obj1 = new B();
        B obj2 = obj1;
        obj2.x = 100;
        System.out.println("What is the value of obj1.x ? " + obj1.x);
    }
    public static void modifyInt(int x){
        x = 20;
        System.out.println("x value is " + x);
    }

    public static void modifyString(User x){
        x = new User(); // creating new object
        x.name = "New";
        System.out.println(x.name);
    }
}

class User{
    String name;
}

class B{
    int x = 50;
}