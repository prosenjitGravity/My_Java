package MultiThreading.Extends;

public class ThreadDemo /*extends Thread implements Runnable*/{ //using Multi-Inheritance Concepts
    static Thread thread = new Thread();

    public static void main(String[] args) {
        System.out.println("The main Thread is  : " + thread);
        System.out.println("thread : "+thread.getName());
        thread.setName("Hello java Thread");
        System.out.println("set new Thread name : "+thread);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
//                System.out.println("Thread isAlive : "+thread.isAlive());
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
