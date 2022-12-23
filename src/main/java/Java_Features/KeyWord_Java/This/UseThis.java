package Java_Features.KeyWord_Java.This;

public class UseThis {
    int a=10;
    static int b=20;
    void display(){
        this.a=100;
        System.out.println(a);
        this.b=200;
        System.out.println(b);
    }
    public static void main(String[] args){
        new UseThis().display();
    }
}
