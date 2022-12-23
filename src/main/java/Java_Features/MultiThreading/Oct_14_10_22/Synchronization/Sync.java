package Java_Features.MultiThreading.Oct_14_10_22.Synchronization;

class CallMe{
    void call(String msg){
        System.out.print("[ "+msg);
        try{
            Thread.sleep(1000);
        }catch(Exception ex){
            System.out.println("Something went wrong  : "+ex);
        }
        System.out.println(" ]");
    }
}
class Caller implements Runnable{
    Thread thread;
    String msg;
    CallMe callMe;
    public Caller( CallMe Me ,String s){
        callMe=Me;
        msg=s;
        thread=new Thread(this);
        thread.start();
    }
    public void run(){
        callMe.call(msg);
    }
}
public class Sync {
    public static void main(String[] args){
        CallMe One=new CallMe();
        Caller Two=new Caller(One,"Hello");
        Caller Three=new Caller(One,"Synchronized");
        Caller Four=new Caller(One,"World");
        try{
            Two.thread.join();
            Three.thread.join();
            Four.thread.join();
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
