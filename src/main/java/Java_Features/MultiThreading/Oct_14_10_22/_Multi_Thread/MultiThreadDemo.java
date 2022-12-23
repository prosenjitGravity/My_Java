package Java_Features.MultiThreading.Oct_14_10_22._Multi_Thread;

class NewThread2 implements Runnable{
    Thread thread;
    String name;
    NewThread2(String name){
        this.name=name;
        thread=new Thread(this,this.name);
        System.out.println("The new Thread is  : "+thread);
        thread.start();
    }
    public void run(){
        try{
            for(int i=1;i<10;i++){
                System.out.println(this.name+" : "+i);
                Thread.sleep(1000);
            }
            System.out.println("Existing "+this.name);
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
public class MultiThreadDemo {
    public static void main(String[] args){
        NewThread2 One = new NewThread2("One");
        NewThread2 Two = new NewThread2("Two");
        NewThread2 Three = new NewThread2("Three");
        System.out.println("Thread One isAlive : "+One.thread.isAlive());
        System.out.println("Thread Two isAlive : "+Two.thread.isAlive());
        System.out.println("Thread Three isAlive : "+Three.thread.isAlive());

        try{
            System.out.println("Waiting for Threads to finish : ");
            One.thread.join();
            Two.thread.join();
            Three.thread.join();
//            Thread.sleep(10000);
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
        System.out.println("Thread One isAlive  "+One.thread.isAlive());
        System.out.println("Thread Two isAlive : "+Two.thread.isAlive());
        System.out.println("Thread Three isAlive : "+Three.thread.isAlive());
    }
}
