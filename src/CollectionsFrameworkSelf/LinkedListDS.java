package CollectionsFrameworkSelf;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node(int data1) {
        data = data1;
        next = null;
    }
}

class Solution {

    public Node insertHead(Node head, int newData){
        Node newNode = new Node(newData, head);
        return newNode;
    }

    public void printList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}


public class LinkedListDS {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node head = new Node(1);
        head.next = new Node(2);

        solution.printList(head);
    }
}
