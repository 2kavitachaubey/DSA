package LinkedList1;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        sll.insertSinglyLinkedList(7,1);
        sll.insertSinglyLinkedList(6,2);
        sll.insertSinglyLinkedList(8,3);
        System.out.println(sll.head.value);
        System.out.println(sll.head.next.value);
        System.out.println(sll.head.next.next.value);
        System.out.println(sll.tail.value);

        sll.traverseSinglyLinkedList();
        sll.searchSinglyLinkedList(6);
        sll.deletionOfNode(2);
        sll.traverseSinglyLinkedList();
        sll.deleteEntireList();
        sll.traverseSinglyLinkedList();
    }
}
