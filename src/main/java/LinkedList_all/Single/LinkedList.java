package LinkedList_all.Single;

public class LinkedList {
    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

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

    public void insertLast(int data) {
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        if (tail == null) {
            insertion(data);
        }
        size++;
    }

    public int deleteFirst() {
        int delete = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
            System.out.println("LinkedList is Empty");
        }
        size--;
        return delete;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return  deleteFirst();
        }
        Node current = get(size - 2);
        int delete = tail.value;
        tail = current;
        tail.next = null;
        return delete;
    }

    public void monitoring() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("end");
    }
}
