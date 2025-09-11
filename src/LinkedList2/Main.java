package LinkedList2;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.createList(5);
        System.out.println(cll.head.value);
        System.out.println(cll.head.next.value);

        cll.insertInList(10,1);
        cll.insertInList(2,2);
        cll.insertInList(5,3);
        cll.insertInList(7,0);
        cll.insertInList(1,5);
        cll.insertInList(21,4);
        System.out.println(cll.head.next.value);
        System.out.println(cll.head.value);

        cll.traversalList();
        System.out.println(cll.searchList(3));

        cll.deleteNode(2);
        cll.deleteNode(0);
        cll.traversalList();

        cll.deleteAll();
        cll.traversalList();
    }
}
