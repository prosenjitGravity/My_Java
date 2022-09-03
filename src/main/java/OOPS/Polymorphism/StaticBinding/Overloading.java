package OOPS.Polymorphism.StaticBinding;

public class Overloading {

    public static void main(String[] args){
        System.out.println(Area(10,20));
        Area(10);
        Area(3.14,5);
        Area(50,20);
    }
    static int Area(int a,int b){
        System.out.println("Area of Rectangle is : ");
        return a*b;
    }
    static double Area(double pi,int r){
        System.out.println("Area of Circle : ");
        return pi*(r*r);
    }
    static long Area(int a){
        System.out.println("Area of Square : ");
        return (a*a);
    }
    static float Area(float base,int height){
        System.out.println("Area of Triangle : ");
        return (base*height)/2;
    }
}
