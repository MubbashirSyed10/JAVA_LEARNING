package ClassLearnings.AccessModifiers.Test;

import ClassLearnings.AccessModifiers.School.Student;
import ClassLearnings.Utils.Utils;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        student5.printCount();
        System.out.println("Student accessing count in Test "+Student.count);
//        student.age = 12;
        student.name = "John";

        School_Singelton_Design_Pattern.getInstance();

        // Use of static methods
        String str = "   sads     sdasddfrgfd ";
        System.out.println(Utils.trimAndUppercase(str));

        System.out.println("PI Value = " + Utils.PI);
    }
}
