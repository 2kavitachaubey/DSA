package LinkedList1;

// linked list store the nodes/ object
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.createSinglyLinkedList(5);
        System.out.println(s1.tail.value);
    }
}
