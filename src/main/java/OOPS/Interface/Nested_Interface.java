package OOPS.Interface;

interface A{
    interface B{
        void fun();
    }
}
class C implements A.B{
    @Override
    public void fun() {
        System.out.println("I'm nested interface method");
    }
}
public class Nested_Interface {
    public static void main(String[] args) {
        C c=new C();
        c.fun();
    }
}
