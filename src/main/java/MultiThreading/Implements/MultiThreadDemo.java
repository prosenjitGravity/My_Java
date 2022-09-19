package MultiThreading.Implements;

class NewThreads implements Runnable{
    String name;
    Thread thread;
    NewThreads( String name){
        thread=new Thread(this,"Demo");
        this.name=name;
        System.out.println("New Thread : "+thread);
        thread.start();
    }

    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println(this.name+"  : "+i);
                Thread.sleep(1000);
            }
        }catch(Exception ex){
            System.out.println("Something Went wrong : "+ex);
        }
    }
}
public class MultiThreadDemo {
    public static void main(String[] args){
        new NewThreads("One");
        new NewThreads("Two");
        new NewThreads("Three");
        new NewThreads("Four");
        new NewThreads("Five");
        try{
           Thread.sleep(10000);
        }catch(Exception ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
