package Aptitude;

public class Demo {
    public static void main(String[] args){
        int x=15,y=20;
        y=x++ + ++x;
        System.out.println("x :"+x+", y : "+y);
    }
}
