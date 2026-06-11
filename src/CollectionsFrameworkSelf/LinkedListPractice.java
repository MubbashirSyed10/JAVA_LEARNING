package CollectionsFrameworkSelf;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.get(2));
        linkedList.addLast(4);
        linkedList.addFirst(0);

        System.out.println(linkedList);

        // Create on the fly linkedList -
        LinkedList<String> stringLinkedList = new LinkedList<>(Arrays.asList("Cat", "Ball", "Car", "Bye"));
        System.out.println("String LinkedLIst - " + stringLinkedList);
    }
}
