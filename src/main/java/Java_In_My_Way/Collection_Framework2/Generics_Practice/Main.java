package Java_In_My_Way.Collection_Framework2.Generics_Practice;

public class Main {
    public static void main(String[] args){
        Generics<Integer> list=new Generics<Integer>();
        System.out.println("Total length of the list : "+list.size());
        list.insert(100);
        list.insert(200);
        list.insert(300);
        list.insert(400);
        list.insert(500);
        list.insert(600);
        System.out.println("Total length of the list : "+list.size());
        System.out.println(list.get(0));
        for(int i=0;i<list.size();i++){
            System.out.println(i+" position element is  : "+list.get(i));
        }
    }
}
