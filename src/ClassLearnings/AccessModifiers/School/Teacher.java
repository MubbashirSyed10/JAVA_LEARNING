package ClassLearnings.AccessModifiers.School;

public class Teacher extends Student{
    public void setAgeofTeacher(){
        setAge(20);
    }
    public void printAge(){
        System.out.println(getAge());
    }
}
