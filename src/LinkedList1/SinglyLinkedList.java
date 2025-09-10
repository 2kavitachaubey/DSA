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

    public void searchSinglyLinkedList(int element){
        if(head == null){
            System.out.println("List is empty.");
        }
        Node temp = head;
        int index = 0;
        while(index < size){
            if(temp.value == element){
                System.out.println("Found the element at index " + index);
                return;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("Element is not in the list.");
    }

    public void deletionOfNode(int location){
        if(head == null){
            System.out.println("The SLL does not exist");
            return;
        }else if(location == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }else if(location >= size){
            Node temp = head;
            int index = 0;
            while(index < size-1){
                temp = temp.next;
                index++;
            }
            if(temp == head){
                tail = head = null;
                size--;
            }else{
                temp.next = null;
                tail = temp;
                size--;
            }
        }else{
            Node temp = head;
            int index = 0;
            while(index < location-1){
                temp = temp.next;
                index++;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void deleteEntireList(){
        head = tail = null;
        System.out.println("Deleted Entire List.");
    }
}
