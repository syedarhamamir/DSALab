class Node {
    int data;       
    Node address;  
    
    public Node(int data) {
        this.data = data;
        this.address = null;
    }
}

public class Linkedlist {
    private Node head, tail;
    private int size;

    public Linkedlist() {
        head = tail = null;
        size = 0;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;  
        } else {
            tail.address = n;  
            tail = n;       
        }
        size++;  
    }

    public void printList() {
        Node current = head;  
        while (current != null) {
            System.out.println(current.data + " ");  
            current = current.address;  
        }
        System.out.println();  
    }
    
    public int getSize(){
    return size;    
    }
    
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println("Linked List: ");
        list.printList();  
        
        System.out.println("List Size:" + list.getSize());
    }
}
