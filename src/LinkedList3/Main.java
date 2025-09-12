package LinkedList3;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createNode(5);
        System.out.println(dll.head.value);

        dll.insertInNode(7,0);
        dll.insertInNode(6,2);
        dll.insertInNode(8,1);
        System.out.println(dll.head.next.value);
        System.out.println(dll.head.next.next.value);

        dll.traversalNode();

        System.out.println(dll.searchList(9));

        dll.deleteNode(1);
        dll.traversalNode();

        dll.deleteAllNode();
    }
}
