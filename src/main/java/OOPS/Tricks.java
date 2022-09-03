package OOPS;
interface A{
    void print();
}
class B{
    void display(){
        System.out.println("Hello world");
    }
}
class C extends B implements A{
    @Override
    public void print() {
        System.out.println("Hello i am override interface");
    }
}
public class Tricks {
    public static void main(String[] args) {
        C s=new C();
        s.print();
        s.display();
    }
}
