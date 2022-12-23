package Java_Features.MultiThreading.Oct_14_10_22.Threading;

public class CurrentThreadDemo {
    public static void main(String[] args)  {
        Thread thread=Thread.currentThread();
        System.out.println("The current Thread is  : "+thread);
        thread.setName("MyThread");
        System.out.println("after changing The thread name is : "+thread);
        System.out.println("the current thread priority is : "+thread.getPriority());
        thread.setPriority(6);
        System.out.println("After changing priority the is  : "+thread.getPriority());
        try{
            for(int i=10;i>0;i--){
                System.out.println(i);
                Thread.sleep(800);
            }
            System.out.println("print completed");
        }catch(Exception ex){
            System.out.println("Something went Wrong : "+ex);
        }
    }
}
