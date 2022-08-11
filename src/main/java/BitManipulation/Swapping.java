package BitManipulation;

public class Swapping {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before");
        System.out.println(a+"");
        System.out.println(b+"");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after");
        System.out.println(a+"");
        System.out.println(b+"");
    }
}
