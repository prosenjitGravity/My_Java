package Competitive_Platform.Java_In_My_Way._21_Days_Coding_Habit.Practice.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.monitoring();
        linkedList.insertion(10);
        linkedList.insertion(20);
        linkedList.insertion(30);
        linkedList.insertion(40);
        linkedList.monitoring();
        linkedList.insertLast(50);
        linkedList.monitoring();
        System.out.println("delete : " + linkedList.deletionFirst());
        linkedList.monitoring();
        System.out.println("delete : "+linkedList.deletionLast());
        linkedList.monitoring();
        System.out.println("size of the linked list : "+linkedList.size);
        linkedList.insert(2,200);
        linkedList.monitoring();
    }
}
