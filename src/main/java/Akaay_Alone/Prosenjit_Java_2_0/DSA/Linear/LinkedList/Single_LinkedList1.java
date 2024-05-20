package Akaay_Alone.Prosenjit_Java_2_0.DSA.Linear.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Single_LinkedList1 {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    private Node head;
    private Node tail;
    public int size;

    class Node {
        private Node next;
        public int value;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = null;
        }
    }

    public Single_LinkedList1() {
        size = 0;
    }

    public void insertInto_FirstPosition(int data) {
        if (alreadyExist(data)) {
            System.out.println(data + " already exist");
        }else{
            Node node = new Node(data);
            node.next = head;
            head = node;
            if (tail != null) {
                tail = head;
            }
            size++;
            System.out.println(data + " : inserted successfully");
        }
    }
    public void insertInto_LastPosition(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node last = head;
        while(last.next != null){
            last =last.next;
        }
        last.next = node ;

    }
    public boolean alreadyExist(int value){
        boolean exist= false;
        Node curr = head;
        while(curr != null){
            if(curr.value == value){
                exist = true;
                break;
            }
            curr= curr.next;
        }
        return exist ? true:false;
    }
    public void printList() {
        Node currentNode = head;
        if(currentNode == null){
            System.out.println("list is empty");
        }else {
            System.out.print("head ---> ");
            while (currentNode != null) {
                System.out.print(currentNode.value + " ---> ");
                currentNode = currentNode.next;
            }
            System.out.println("tail");
        }
    }

    public static void chooseOptions() throws IOException {
        Single_LinkedList1 list = new Single_LinkedList1();
        System.out.println("press 'if' for insert first position");
        System.out.println("press 'il' for insert Last Position");
        System.out.println("press 'pl' for print list value");
        System.out.println("press 'qt' Quite LinkedList Program");
        String op;
        do {
            System.out.println("Enter options : ");
            op = predator.readLine().trim();
            switch (op) {
                case "if":
                    System.out.println("Enter data : ");
                    int data = Integer.parseInt(predator.readLine());
                    list.insertInto_FirstPosition(data);
                    break;
                case "pl":
                    list.printList();
                    break;
                case "il":
                    System.out.println("Enter data : ");
                    int data1 = Integer.parseInt(predator.readLine());
                    list.insertInto_LastPosition(data1);
                    break;
                case "qt":
                    System.out.println("Quite LinkedList Program");
                    break;
                default:
                    System.out.println("Something went wrong '" + op + "' not available please choose correct on");
            }
        } while (!op.equals("qt"));
    }

    public static void main(String[] args) throws IOException {
        chooseOptions();
    }

}
