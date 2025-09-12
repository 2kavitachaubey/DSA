package LinkedList3;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node createNode(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.prev = null;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insertInNode(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createNode(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }else if(location >= size){
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        }else{
            Node temp = head;
            for(int i = 0; i<location-1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;
            node.next.prev = node;
        }
        size++;
    }

    public void traversalNode(){
        if(head != null) {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value);
                if(temp.next != null){
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
            System.out.println("\n");
        }else{
            System.out.println("List doesn't exist");
        }
    }

    public boolean searchList(int value){
        if(head != null){
            Node temp = head;
            while(temp != null){
                if(temp.value == value){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
        else{
            System.out.println("Doubly Linkedlist doesn't exist");
            return false;
        }
    }

    public void deleteNode(int location){
        if(head == null){
            System.out.println("DDL does not exists");
        }else if(location == 0){
            if(size == 1){
                head = null;
                tail = null;
                size--;
            }
            else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }else if(location >= size){
            if(size == 1){
                head = null;
                tail = null;
                size--;
            }else{
                tail = tail.prev;
                tail.next = null;
                size--;
            }
        }else{
            Node temp = head;
            for(int i = 0; i<location-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
    }

    public void deleteAllNode(){
        Node temp = head;
        while(temp != null){
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        tail = null;
        System.out.println("The DLL has been deleted!");
    }
}
