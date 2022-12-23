package Lambda_Expression;

class CodeToRun implements Runnable{

    @Override
    public void run() {
        System.out.println("printing from Runnable interface");
    }
}
public class Demo {
    public static void main(String[] args){
        new Thread(()->{
            System.out.println("Hello world");
        }).start();
    }
}
