package Java_In_My_Way._21_Days_Coding_Habit.Practice.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    public int size;

    public LinkedList() {
        this.size = 0;
    }

    private class Node {
        int value;
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

    public void insertLast(int data) {
        if (tail == null) {
            insertion((data));
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            insertion(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deletionFirst() {
        int delete = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
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

    public int deletionLast() {
        if (size <= 1) {
            deletionFirst();
        }
        Node second = get(size - 2);
        int value = tail.value;
        tail = second;
        tail.next = null;
        return value;
    }

    public void monitoring() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("tail");
    }
}
