package Akaay_Alone.Prosenjit_Java_2_0.DSA.Linear.LinkedList.Single_LinkedList;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LinkedList_operations {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
    Node head;

    public void insertInto_FirstPosition(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertInto_LastPosition(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = node;
    }

    public void InsertInto_Specific_Position(int data, int position) {
        int index = 1;
        Node node = new Node(data);
        Node currentNode = head;
        while (index < (position - 1)) {
            System.out.println(" while currentNode : " + currentNode.data);
            currentNode = currentNode.next;
            System.out.println("after increment next currentNode: " + currentNode.data);
            index++;
        }
        System.out.println("step :1 node.data : " + node.data);
        System.out.println("step :2 currentNode next : " + currentNode.next.data);
        System.out.println("step :3 currentNode : " + currentNode.data);
        node.next = currentNode.next;
        System.out.println("step :4 currentNode : " + currentNode.data);
        System.out.println("step 5  currentNode next: " + currentNode.next.data);
        System.out.println("step 6 : node.data next " + node.next.data);
        System.out.println("step 7 : node.data " + node.data);
        currentNode.next = node;
        System.out.println("step :4 currentNode : " + currentNode.next.data);
    }

    public void delete_First() {
        Node curr = head;
        if (curr == null) {
            return;
        }
        head = curr.next;
    }

    public void delete_Last() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void delete_specificPosition(int position) {
        Node curr = head;

        int index = 1;
        while (index < (position - 1)) {
            curr = curr.next;
            index++;
        }
        Node temp = curr.next.next;
        curr.next = temp;

    }

    public void sumOfNumbers() {
        Node nodes = head;
        int sum = 0;
        while (nodes != null) {
            sum += nodes.data;
            nodes = nodes.next;
        }
        System.out.println("total : " + sum);
    }


    public void printList() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("list is empty");
        } else {
            System.out.print("head ---> ");
            while (currentNode != null) {
                System.out.print(currentNode.data + " ---> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }
    }


    public void chooseOptions() throws IOException {
//        LinkedList_operations list = new LinkedList_operations();
        System.out.println("press 'if' for insert first position");
        System.out.println("press 'il' for insert Last Position");
        System.out.println("press 'pl' for print list value");
        System.out.println("press 'df' for delete first node");
        System.out.println("press 'dl' for delete last node");
        System.out.println("press 'qt' Quite LinkedList Program");
        System.out.println("press 'sm' for sum all value of the list");
        String op;
        do {
            System.out.println("Enter options : ");
            op = predator.readLine().trim();
            switch (op) {
                case "if":
                    System.out.println("Enter data : ");
                    int data = Integer.parseInt(predator.readLine());
                    insertInto_FirstPosition(data);
                    break;
                case "pl":
                    printList();
                    break;
                case "il":
                    System.out.println("Enter data : ");
                    int data1 = Integer.parseInt(predator.readLine());
                    insertInto_LastPosition(data1);
                    break;
                case "isp":
                    System.out.println("Enter data : ");
                    int value = Integer.parseInt(predator.readLine());
                    System.out.println("Enter data : ");
                    int position = Integer.parseInt(predator.readLine());
                    InsertInto_Specific_Position(value, position);
                    break;
                case "sm":
                    sumOfNumbers();
                    break;
                case "df":
                    delete_First();
                    break;
                case "dl":
                    delete_Last();
                    break;
                case "dsp":
                    System.out.println("Enter data : ");
                    int index = Integer.parseInt(predator.readLine());
                    delete_specificPosition(index);
                    break;
                case "qt":
                    System.out.println("Quite LinkedList Program");
                    break;
                default:
                    System.out.println("Something went wrong '" + op + "' not available please choose correct on");
            }
        } while (!op.equals("qt"));
    }
}
