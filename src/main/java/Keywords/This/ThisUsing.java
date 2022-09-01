package Keywords.This;
class Sample{
    void fun(int a,int b){
        System.out.println("Hello there");
        System.out.println(a+b);
    }
    void fun1(){
        this.fun(10,20);

    }
}
public class ThisUsing {
    public static void main(String[] args){
        Sample are=new Sample();
        are.fun1();

    }
}
