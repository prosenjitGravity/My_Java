package OOPS.Inheritance.Hierarchical;

class A{
    void printA()
    {
        System.out.println("Hello i'm class A method ");
    }
}
class B extends A{
    void printB(){
        System.out.println("Hello i'm class B method ");
    }
}
class C extends A{
    void printC(){
        System.out.println("Hello i'm class C method");
    }
}
class D extends A{
    void printD(){
        System.out.println("Hello i'm class D method");
    }
}
public class Hierarchy {
    public static void main(String[] args){
        B b=new B();
        b.printA();
        b.printB();

        C c=new C();
        c.printA();
        c.printC();

        D d=new D();
        d.printA();
        d.printD();
    }
}
