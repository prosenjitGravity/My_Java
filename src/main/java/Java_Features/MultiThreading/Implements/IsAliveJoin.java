package Java_Features.MultiThreading.Implements;

class NewThread1 implements Runnable{
    String name;
    Thread thread;
    NewThread1(String name){
        this.name=name;
        thread=new Thread(this,"Demo");
        thread.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(this.name+" : "+i);
                Thread.sleep(1000);
            }
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
        System.out.println(this.name+" :  exiting");
    }
}
public class IsAliveJoin {
    public static void main(String[] args){
        NewThread1 ob1=new NewThread1("One");
        NewThread1 ob2=new NewThread1("Two");
        NewThread1 ob3=new NewThread1("Three");
//        NewThread1 ob4=new NewThread1("Four");
        System.out.println("Thread One isAlive : "+ob1.thread.isAlive());
        System.out.println("Thread Two isAlive : "+ob2.thread.isAlive());
        System.out.println("Thread Three isAlive : "+ob3.thread.isAlive());
        try{
            System.out.println("waiting for thread to finish");
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
        System.out.println("One : "+ob1.thread.isAlive());
        System.out.println("Two : "+ob2.thread.isAlive());
        System.out.println("Three : "+ob3.thread.isAlive() );
    }
}
