package DSAlgo.LinkedLists.SingleLinkedList;

public class My_LinkedList {
    Node head;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public My_LinkedList Insertion(My_LinkedList list,int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(list.head==null){
            list.head=newNode;
        }else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }
    public static void Monitoring(My_LinkedList list){
        Node current=list.head;
        while(current!=null){
            System.out.print(current.data+" ->");
            current=current.next;
        }
        System.out.println("End");
    }

}
