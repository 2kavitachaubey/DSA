package LinkedList1;

// linked list store the nodes/ object
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.createSinglyLinkedList(5);
        System.out.println(s1.tail.value);

        //insertion
        s1.insertInLinkedList(8,0);
        System.out.println(s1.head.value);
        s1.insertInLinkedList(7,1);
        System.out.println(s1.head.next.value);
        s1.insertInLinkedList(3,2);
        System.out.println(s1.head.next.next.value);
        System.out.println(s1.tail.value);


    }
}
