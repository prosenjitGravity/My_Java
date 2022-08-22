package Anonymous;

class Nested {
    public static void display() {
        System.out.println("Hello Nested");
    }
}

class AnonymousDemo {
    public static void createClass() {
        Nested a = new Nested() {
            public void monitoring() {
                System.out.println("Anonymous Nested Class");
            }
        };
        a.display();
    }
}

public class AnonymousClass {
    public static void main(String[] args){
        AnonymousDemo d=new AnonymousDemo();
        d.createClass();
    }
}
