package LinkedList4;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedLIst cdl = new CircularDoublyLinkedLIst();
        cdl.createCircularDoubly(5);
        System.out.println(cdl.head.value);
        cdl.insertValue(8,0);
        cdl.insertValue(3,4);
        cdl.insertValue(7,2);
        cdl.insertValue(2,1);

        cdl.traversalList();

        System.out.println(cdl.searchNode(4));

        cdl.deleteNode(1);
        cdl.traversalList();

        cdl.deleteEntire();
        cdl.traversalList();
    }
}
