package My_Threads;

public class ThreadTester {
    public static void main(String[] args){
        System.out.println("main si starting....");
        Thread thread=new Thread(new Thread1("Thread1"),"thread1");
        thread.start();
        Thread thread1=new Thread(new Thread2(),"Thread2");
        thread1.start();
        System.out.println("main is exiting.");
    }
}
