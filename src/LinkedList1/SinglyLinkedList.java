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
    public void insertInLinkedList(int value, int location){
        Node node = new Node();
        node.value = value;
        if(head == null){
            createSinglyLinkedList(value);
        }else if(location == 0){
            node.next = head;
            head = node;
        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = node;
            node.next = tempNode.next.next;
        }
        size++;
    }
}
