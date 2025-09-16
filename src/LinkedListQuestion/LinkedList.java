package LinkedListQuestion;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node createNode(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insertNode(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void travelsal(){
        Node temp = head;
        do{
            System.out.print(temp.value);
            if(temp.next != head){
                System.out.print(" -> ");
            }
            temp = temp.next;
        }while(temp != null);
    }
}
