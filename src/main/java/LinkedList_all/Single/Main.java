package LinkedList_all.Single;

public class Main {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        linkedList.insertion(10);
        linkedList.insertion(20);
        linkedList.insertion(30);
        linkedList.monitoring();
        linkedList.insertion(40);
        linkedList.monitoring();
        linkedList.insertLast(5);
        linkedList.monitoring();
        System.out.println(linkedList.deleteFirst()+" is deleted");
        System.out.println(linkedList.deleteFirst()+" is deleted");
        linkedList.monitoring();
        System.out.println(linkedList.deleteLast()+" is deleted");
        linkedList.monitoring();
    }
}
