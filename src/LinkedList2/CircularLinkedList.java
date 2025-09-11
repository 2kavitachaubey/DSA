package LinkedList2;

public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node createList(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size++;
        return head;
    }
    public void insertInList(int nodeValue,int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head.next;
            head = node;
            tail.next = node;
            size++;
        }
        else if(location >= size){
            node.next = tail.next;
            tail.next = node;
            tail = node;
            size++;
        }
        else{
            Node temp = head;
            int index = 0;
            if(index < location){
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void traversalList(){
        if(head != null){
            Node temp = head;
            for(int i = 0; i<size; i++){
                System.out.print(temp.value);
                if(i<size-1){
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
            System.out.println("\n");
        }else{
            System.out.println("Node is Empty");
        }
    }
    public boolean searchList(int nodeValue){
        if(head != null){
            Node temp = head;
            for(int i = 0; i<size; i++){
                if(temp.value == nodeValue){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
        System.out.println("node not found.");
        return false;
    }

    public void deleteNode(int location){
        if(head == null){
            System.out.println("Node is empty");
            return;
        }
        else if(location == 0){
            head = head.next;
            tail.next = head;
            size--;
            if(size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
        }else if(location >= size){
            Node temp = head;
            for(int i = 0; i<size-1; i++){
                temp = temp.next;
            }
            if(temp == head){
                head.next = null;
                tail = head = null;
                return;
            }
            temp.next =  head;
            tail = temp;
            size--;
        }else{
            Node temp = head;
            for(int i =0 ; i < location-1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void deleteAll(){
        if(head == null){
            System.out.println("list is not exist");
        }else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The list is deleted");
        }
    }
}
