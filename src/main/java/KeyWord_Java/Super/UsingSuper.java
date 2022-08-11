package KeyWord_Java.Super;

class Parent {
    int a = 10;
    static int b = 20;
}

public class UsingSuper extends Parent {
    public void display() {
        System.out.println(super.a);
        System.out.println(super.b);
    }

    public static void main(String[] args) {
        new UsingSuper().display();
    }
}
