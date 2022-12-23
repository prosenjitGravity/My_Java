package Java_Features.Keywords.This;

public class UsingThis {
    UsingThis(){
        System.out.println("Hello world");

    }
    public UsingThis(int a,int b){
        this(10,20,30);
        System.out.println(a+b);
    }
    private UsingThis(int a,int b,int c){
        this();
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        new UsingThis();
        new UsingThis(10,20);
    }

}
