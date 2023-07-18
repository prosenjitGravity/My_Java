package Competitive_Platform.Java_In_My_Way._21_Days_Coding_Habit.LinkedList;

public class Linked_List {
    private Node head;
    private Node tail;
    private int size;

    public Linked_List(int size) {
        this.size = size;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertion(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insert_last(int data) {
        if (tail == null) {
            insertion(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void specific_position(int data, int index) {
        if (index == 0) {
            insert_last(data);
            return;
        }
        if (index == 0) {
            insertion(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("tail");
    }

    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public static void main(String[] args) {
        Linked_List list = new Linked_List(0);
        list.insertion(10);
        list.insertion(20);
        list.insertion(30);
        list.insertion(40);
        list.insert_last(100);
        list.specific_position(200,2);
        list.display();
        System.out.println("\n size of the linked list : "+list.size);
        System.out.println("\n  "+list.deletefirst()+" value is deleted");
        list.display();
        System.out.println("\n size of the linked list : "+list.size);

    }
}
