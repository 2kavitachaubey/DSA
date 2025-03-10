package LinkedList1;

public class SinglyLinkedList {
    public Node head;         // Store the node/object
    public Node tail;
    public int size;
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();  // Created a node
        node.next = null;        // Next element is not there
        node.value = nodeValue;  // Value of node
        head = node;             // First element is node
        tail = node;             // Last element is node
        size = 1;
        return head;
    }
}
