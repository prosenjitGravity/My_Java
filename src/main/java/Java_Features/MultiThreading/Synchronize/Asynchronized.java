package Java_Features.MultiThreading.Synchronize;

class Callme{
    void Call(String msg){
        System.out.println("[ "+msg);
        try{
            Thread.sleep(1000);
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
class Caller implements Runnable{
    String msg;
    Callme target;
    Thread thread;
    public Caller(Callme target,String msg){
        this.msg=msg;
        this.target=target;
        thread=new Thread();
        thread.start();
    }
    public void run(){
        target.Call(msg);
    }
}
public class Asynchronized {
    public static void main(String[] args){
        Callme target=new Callme();
        Caller ob1=new Caller(target, "Hello");
        Caller ob2=new Caller(target,"Synchronized");
        Caller ob3=new Caller(target,"World");
        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }

    }
}
