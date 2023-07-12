package Generics;

import java.util.Arrays;

public class GenericsDemo<T> {
    T[] arr;
//    public static final int a=10;
//    final static public int b = 20;
//    final public static int c=30;
//    static final public int d=40;

    GenericsDemo(T[] arr){
        this.arr=arr;
    }
    void println(){
        for(T i:arr){
            System.out.print(i+" ");
        }
    }
    void sorting_object(){
        Arrays.sort(arr);
        System.out.println("\nafter sorting  : ");
        for(T i:arr){
            System.out.print(i);
            if(!i.equals(arr.length)){
                System.out.print(",");
            }else{
                System.out.print(".");
            }
        }
        System.out.println();
    }

    static public void main(String[] args){
        GenericsDemo gd=new GenericsDemo(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(gd.arr.getClass().getName());
        gd.println();
        gd.sorting_object();
        GenericsDemo gd1=new GenericsDemo(new String[]{"Apple","Microsoft","Adobe","Google","Amazon","TCS"});
        System.out.println(gd1.arr.getClass().getName());
        gd1.println();
        gd1.sorting_object();
    }
}

/*
* I am a Final-year undergraduate student at IIT Kharagpur.
*  I'm skilled in Competitive Programming, Blockchain Development,
* Web Development, UI/UX, Finance, Product Designing, and Team Management.
* Strong operation professional with a Bachelor of Technology -
* BTech focused in Civil Engineering from the Indian Institute of Technology, Kharagpur(2020-'24).
* */