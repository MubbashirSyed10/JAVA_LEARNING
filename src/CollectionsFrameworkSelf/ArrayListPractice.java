package CollectionsFrameworkSelf;

import java.lang.reflect.Array;
import java.util.*;

//class StringLengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//    }
//}

class IntCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(20);
        list.add(20);
        list.add(222);
        list.add(2);

        for (Object o : list) {

            System.out.printf("Value is %s ", o);
            System.out.println();
        }
        System.out.println("Size - " + list.size());

        System.out.println("Contains ? - " + list.contains(5));
        list.remove(2);

        list.add(2, 59);
        list.add(3, 211);
        list.add(3, 11);
        list.set(3, 1);
        System.out.println("List - " + list);


        // PECS = Producer Extends, Consumer Super
        ArrayList<? super Number> list1 = new ArrayList<>();
        list1.add(0, 1);
        list1.add(1, 2.2);
        list1.add(2, 2222);

        System.out.println("Printing list1 with generics consumer - " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);

        if (list2 == list3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(list2.equals(list3));

        List<Integer> newList = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("New list with List.of method - " + newList);
        System.out.println(newList.getClass().getName()); // java.util.ImmutableCollections$ListN

        List<String> days = Arrays.asList("Mon, Tue");
        System.out.println(days.getClass().getName()); // java.util.Arrays$ArrayList
        Collections.sort(list);
        System.out.println("Sorted list - " + list);
        list.sort(new IntCompare());
        System.out.println("Sorted in des - " + list);


        List<String> stringList = new ArrayList<>(Arrays.asList("banana", "apple", "mango", "date", "melon"));
//        stringList.sort(new StringLengthComparator());
        stringList.sort((a, b) -> a.length() - b.length());
        System.out.println("Sorted stringList (by length) = " + stringList);

        System.out.println(stringList.reversed());
    }

}
