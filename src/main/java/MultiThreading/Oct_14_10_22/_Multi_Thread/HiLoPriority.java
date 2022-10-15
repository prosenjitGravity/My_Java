package MultiThreading.Oct_14_10_22._Multi_Thread;

class Clicker implements Runnable{
    Thread thread;
    int click=0;
    private volatile boolean running=true;
    Clicker(int p){
        thread=new Thread(this);
        thread.setPriority(p);
    }
    public void run(){
        while(running){
            click++;
        }
    }
    public void stop(){
        running =false;
    }
    public void start(){
        thread.start();
    }
}
public class HiLoPriority {
    public static void main(String[] args){
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi=new Clicker(Thread.NORM_PRIORITY+2);
        Clicker lo=new Clicker(Thread.NORM_PRIORITY-2);
        lo.start();
        hi.start();
        try{
            Thread.sleep(10000);
        }catch(Exception ex){
            System.out.println("Main Thread Interrupted : "+ex);
        }
        lo.stop();
        hi.stop();
        try{
            hi.thread.join();
            lo.thread.join();
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
        System.out.println("Low Priority Thread : "+lo.click);
        System.out.println("High Priority Thread : "+hi.click);
    }
}
