package DSAlgo.LinkedLists.SingleLinkedList;

import java.util.Scanner;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static LinkedList Insertion(LinkedList list,int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
        }else{
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    public static LinkedList InsertBeg(LinkedList list,int data){
        Node beg=list.head; int index=0;
//        if(beg!=null){
//
//        }
        int count=0;
        Node temp=new Node(data);
        temp.next=null;
        while(beg!= null) {
            if (beg==list.head){
                beg=beg.next;
                list.head=temp;
            }
        }
        return list;
    }
    public static void Monitoring(LinkedList list){
        Node current=list.head;
        if(current!=null) {
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println();
        }else{
            System.out.println("LinkedList is Empty");
        }
    }

    public static LinkedList DeleteFromBeg(LinkedList list){
        Node deleted=list.head ;
        int i=0;
        if (deleted!=null){
            list.head=deleted.next;
            System.out.println(i+"element deleted :");
        }else{
            System.out.println("Linked list is Underflow please insert the data");
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        System.out.println("LinkedList Operations : ");
        System.out.println("press '1' to Insert data");
        System.out.println("press '2' to Delete data");
        System.out.println("press '3' to Monitoring data");
        System.out.println("press '0' to close program");
        Scanner predator=new Scanner(System.in);
        int option;
        do{
            System.out.println("choose the Option : ");
            option=predator.nextInt();
            switch(option){
                case 1: System.out.println("Enter the data : ");
                        Insertion(ll,predator.nextInt());
                break;
                case 2: DeleteFromBeg(ll);
                break;
                case 3: Monitoring(ll);
                break;
                case 4: System.out.println("Enter the data : ");
                        InsertBeg(ll,predator.nextInt(predator.nextInt()));
                break;
                case 0: System.out.println("LinkedList Operation closed.");
                break;
                default:System.out.println("Something went wrong "+option+" ?");
            }
        }while(option!=0);

    }
}
