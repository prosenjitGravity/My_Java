package Java_Features.MultiThreading.Extends;

class NewThread extends Thread{
    NewThread(){
        super("My Thread");
        System.out.println("Child Thread : "+this);
        start();
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
public class ExtendThread {
    public static void main(String[] args){
        new NewThread();
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Main Thread  : " + i);
                Thread.sleep(1000);
            }
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
