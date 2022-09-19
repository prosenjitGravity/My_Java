package MultiThreading.Extends;

class MultiThreadingDemo extends Thread{
    public void run(){
        try {
            System.out.println(Thread.currentThread().getId());
        }
        catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
public class ExtendsDemo {
    public static void main(String[] args){
        try{
            for(int i=0;i<5;i++){
                MultiThreadingDemo m=new MultiThreadingDemo();
                m.start();
            }
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
