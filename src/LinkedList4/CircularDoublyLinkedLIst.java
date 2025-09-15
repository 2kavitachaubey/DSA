package LinkedList4;

public class CircularDoublyLinkedLIst {
    public Node head;
    public Node tail;
    public int size;
    public Node createCircularDoubly(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        head = node;
        tail = node;
        node.prev = node;
        node.next = node;
        size = 1;
        return head;
    }
    public void insertValue(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createCircularDoubly(nodeValue);
            return;
        } else if(location ==0) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        }else if(location >= size){
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            tail = node;
        }else{
            Node temp = head;
            for(int i = 0; i<location-1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next.prev = node;
            temp.next = node;
        }
        size++;
    }
    public void traversalList(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value);
                if(temp.next != head){
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }while(temp != head);
            System.out.println("\n");
        }else{
            System.out.println("cdl does not exist");
        }
    }
    public boolean searchNode(int value){
        if(head != null){
            Node temp = head;
            do{
                if(temp.value == value){
                    return true;
                }
                temp = temp.next;
            }while(temp != head);
        }
        return false;
    }
    public void deleteNode(int location){
        if(head == null){
            System.out.println("cdl doesn't not exist.");
            return;
        }
        if(size == 1){
            head.next = null;
            head.prev = null;
            head = tail = null;
            size = 0;
        }
        if(location == 0){
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
        }else if(location >= size){
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
        }
        else{
            Node temp = head;
            for(int i = 0 ;i <location-1; i++){
                temp= temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
    }

    public void deleteEntire(){
        Node temp = head;
        do{
            temp.prev = null;
            temp = temp.next;
        }while(temp != head);
        head = null;
        tail = null;
        System.out.println("The CDL has ");
    }
}
