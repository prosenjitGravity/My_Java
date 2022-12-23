package Java_Features.MultiThreading.Oct_14_10_22.Threading;

class NewThread1 extends Thread{
    NewThread1(){
        super("MyThread");
        System.out.println("The Current Thread name is  : "+this);
        start();
    }
    public void run(){
        try{
            for(int i=1;i<10;i++){
                System.out.println("Child thread : "+i);
                Thread.sleep(500);
            }
            System.out.println("Existing Child Thread");
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
public class ExtendsThreadDemo {
    public static void main(String[] args){
        new NewThread1();
        try{
            for(int i=10;i>=1;i--){
                System.out.println("Main thread : "+i);
                Thread.sleep(1000);
            }
            System.out.println("Existing Main Thread");
        }catch(Exception ex){
            System.out.println("something went wrong : "+ex);
        }
    }
}
