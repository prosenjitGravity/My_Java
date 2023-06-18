package OOPS.Inheritance.Interface;

interface InA{
    static void display(){
        System.out.println("Hello interface");
    }
}
interface InB{
    static void display(){
        System.out.println("Hello interface B");
    }
}
public class InterfaceDemo implements InA ,InB {
    public static void main(String[] args){
        InA.display();
    }
}
