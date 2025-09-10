package LinkedList1;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node createSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insertSinglyLinkedList(int nodeValue,int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            head = node;
        }else if(location>=size){
            node.next = null;
            tail.next =node;
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if(head == null){
            System.out.println("SLL does not exist");
        }else{
            int index = 0;
            Node temp = head;
            System.out.print("Traversal of Node: ");
            while(index<size){
                System.out.print(temp.value);
                if(index < size -1){
                    System.out.print(" -> ");
                }
                temp = temp.next;
                index++;
            }
        }
        System.out.println("\n");
    }
}
