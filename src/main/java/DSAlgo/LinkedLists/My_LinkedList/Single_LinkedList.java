package DSAlgo.LinkedLists.My_LinkedList;

public class Single_LinkedList {
    Node head;
    private int size;
    Single_LinkedList(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is Empty.");
            return ;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is Empty.");
            return ;
        }
        size--;
        if (head.next==null){
            head=null;
            return ;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void Monitoring(){
        if(head==null){
            System.out.println("The LinkedList Is Empty.");
            return ;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args){
        Single_LinkedList linkedList=new Single_LinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.Monitoring();
        System.out.println("size of the LinkedList : "+linkedList.getSize());
        linkedList.addLast(40);
        linkedList.Monitoring();
        linkedList.deleteFirst();
        linkedList.Monitoring();
        linkedList.deleteLast();
        linkedList.Monitoring();
        System.out.println("size of the LinkedList : "+linkedList.getSize());
    }
}
