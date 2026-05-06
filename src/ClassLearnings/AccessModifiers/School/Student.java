package ClassLearnings.AccessModifiers.School;

public class Student {
    public String name;
    private int age;
    public static int count = 0;
    public Student(){
        System.out.println("Constructor called");
        count++;
    }
    static{
        System.out.println("Static block loaded !!!");
    }
    public void printCount(){
        System.out.println("Count value is : "+ count);
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
