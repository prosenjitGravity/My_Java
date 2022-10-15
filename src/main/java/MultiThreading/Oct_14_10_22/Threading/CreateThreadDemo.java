package MultiThreading.Oct_14_10_22.Threading;

class NewThread implements Runnable{
    Thread thread;
    NewThread(){
        thread=new Thread(this,"MyThread");
        System.out.println("Name of the current Thread : "+thread);
        thread.start();
    }
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
            System.out.println("Existing child thread");
        }catch(Exception ex){
            System.out.println("something went wrong : "+ex);
        }
    }
}
public class CreateThreadDemo {
    public static void main(String[] args){
        new NewThread();
        try{
            for(int i=10;i>=1;i--){
                System.out.println("main thread : "+i);
                Thread.sleep(1000);
            }
            System.out.println("Existing main thread");
        }catch (Exception ex){
            System.out.println("something went wrong : "+ex);
        }
    }
}
