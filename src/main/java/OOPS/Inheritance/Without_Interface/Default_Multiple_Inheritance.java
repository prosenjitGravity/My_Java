package OOPS.Inheritance.Without_Interface;

interface one{
    void print();
}
class two{
    void run(){
        System.out.println("i'm class two");
    }
}
class Three extends two implements one{

    @Override
    public void print() {
        System.out.println("Hello i'm interface one");
    }
}
public class Default_Multiple_Inheritance {
    public static void main(String[] args){
        Three th=new Three();
        th.print();
        th.run();
    }
}
