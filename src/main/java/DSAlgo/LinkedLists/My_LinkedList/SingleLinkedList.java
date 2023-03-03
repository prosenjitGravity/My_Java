package DSAlgo.LinkedLists.My_LinkedList;

public class SingleLinkedList {
    Node head;
    private int size;

    public SingleLinkedList() { // using default constructor to define the size of the list default size of the LinkedList is  always 0
        this.size = 0;
    }

    static class Node {
        String data;
        Node next;

        Node(String data) { //create node structure  every node have two part --- 1. data , 2. link
            this.data = data;
            this.next = null;
        }
    }

    public SingleLinkedList addFirst(SingleLinkedList list, String data) {
        Node newNode = new Node(data); // create new node
        //  if head is null then head = newNode
        if (head == null) {
            head = newNode;
            return list;
        }
        size++;       // increment the size of the LinkedList
        newNode.next = head;
        head = newNode;
        return list;
    }

    public SingleLinkedList addLast(SingleLinkedList list, String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return list;
        }
        size++;                                   // increment size of the LinkedList
        Node currentNode = head;                 //Initialize currentNode is  point to head
        while (currentNode.next != null) {      // check the currentNode.next element is not equal to null
            currentNode = currentNode.next;    // currentNode is initialize currentNode.next node position
        }                                     // if currentNode == null{
        currentNode.next = newNode;          //  then     currentNode.next=add NewNode  }
        return list;                        // then return list
    }

    public SingleLinkedList deleteFirst(SingleLinkedList list) {
        if (head == null) {
            System.out.println("The linkedList is Empty.");
            return list;
        }
        size--;
        head = head.next;
        return list;
    }

    public SingleLinkedList deleteLast(SingleLinkedList list) {
        if (head == null) {
            System.out.println("The LinkedList is Empty.");
            return list;
        }
        size--;
        if (head.next == null) {  // head.next means second element of the list
            head = null;          // head.next is null then return null;
            return list;
        }
        Node firstLast = head.next;           //  let's start firstLast mens 2nd element of the list
        Node secondLast = head;              //  secondLast means first position element
        while (firstLast.next != null) {    //  while loop is true when firstLast.next==null ? if firstLast==null then
            firstLast = firstLast.next;    //  firstLast always increment into fastLast.next  when firstLast==null then stop;
            secondLast = secondLast.next; //  secondLast=secondLast.next means  firstLast previous element
        }
        secondLast.next = null;         // if firstLast is null already  then secondLast.next initialize = null
        return list;
    }

    public void println() {  // monitoring or displaying the elements
        if (head == null) {   // check if head is nll then return [the linkedList is Empty];
            System.out.println("LinkedList is Empty.");
            return;
        }
        Node currentNode = head;       //initialize the currentNode position is head
        while (currentNode != null) {    //check the currentNode is not equal to null
            System.out.print(currentNode.data + " -> ");   //print currentNode data
            currentNode = currentNode.next;   // currentNode initialize the next Node;
        }
        System.out.println("null");
        System.out.println("size of the LinkedList is  : " + size);// present size of the LinkedList
        System.out.println("------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        System.out.println(list.addFirst(list, "Hello"));
        list.println();
        System.out.println(list.addFirst(list, "World"));
        list.println();
        System.out.println(list.addLast(list, "Gravity"));
        list.println();
        list.deleteFirst(list);
        list.println();
        list.deleteLast(list);
        list.println();
        list.deleteLast(list);
        list.println();
        list.deleteLast(list);
        list.println();
    }
}
