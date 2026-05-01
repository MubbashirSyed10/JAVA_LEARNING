package Test;

import humans.Child;
import humans.Parent;

public class TestHumans {
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Zaid");
        child.setAge(22);
        System.out.println("CHild name = "+ child.getName());
        System.out.println("Child age = " + child.getAge());

        Parent parent = new Parent(2);
        System.out.println("Parent name - "+ parent.getName());
        System.out.println("Parent age - "+ parent.getAge());
    }

}
