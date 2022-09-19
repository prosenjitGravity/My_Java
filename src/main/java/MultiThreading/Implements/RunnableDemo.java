package MultiThreading.Implements;
class NewThread implements Runnable{
    Thread thread;
    NewThread(){
        thread=new Thread(this,"Demo Thread");
        System.out.println("child Thread : "+thread);
        thread.start();
    }

    @Override
    public void run() {
        try{
            for(int i=10;i>0;i--){
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException ex){
            System.out.println("Something went wrong  : "+ex);
        }
        System.out.println("Exiting child  thread");
    }
}
public class RunnableDemo {
    public static void main(String[] args){
        new NewThread();
        try{
            for(int i=10;i>0;i--){
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException ex){
            System.out.println("Something went wrong  : "+ex);
        }
        System.out.println("Main Thread exiting");
    }
}
