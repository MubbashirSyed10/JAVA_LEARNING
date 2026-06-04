package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("12");
//        list.add(3);

//        Integer i = (Integer) list.get(2);
//        System.out.println(i);
        System.out.println(list);



        GenericClass<Integer> genericClass = new GenericClass<>();
        genericClass.set(20);
        int gen = genericClass.get();
        System.out.println("Generic class 1 -> " + gen);

        GenericClass<String> genericClassString = new GenericClass<>();
        genericClassString.set("Hellow Orld");
        String s = genericClassString.get();
        System.out.println("Generic class 2 -> " + s);
    }
}
