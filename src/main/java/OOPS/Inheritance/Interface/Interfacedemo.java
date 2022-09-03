package OOPS.Inheritance.Interface;

interface InA{
    static void display(){
        System.out.println("Hello interface");
    }
}
public class Interfacedemo implements InA {
    public static void main(String[] args){
        InA.display();
    }
}
