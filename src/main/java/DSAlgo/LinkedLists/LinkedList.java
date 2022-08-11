package DSAlgo.LinkedLists;

public class LinkedList {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static LinkedList insert(LinkedList list,int data){
        Node newNode=list.head;
        newNode.next=null;
        if(list.head==null){
            newNode=list.head;
        }else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }
    public static void Monitoring(LinkedList list){
        Node currentNode=list.head;
        System.out.println("Monitoring LinkedList Elements : ");
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("null\n");
    }
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        insert(list,10);
        Monitoring(list);

    }
}
