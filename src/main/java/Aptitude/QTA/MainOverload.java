package Aptitude.QTA;

import java.util.Arrays;

public class MainOverload {
    public static void main(String[] args){
        System.out.println("I'm Main method");
        main(new int[]{1,2,3,4,5,6,7,8,9});
        main(new char[]{'h','e','l','l','o','w','o','r','l','d'});
        main(new double[]{10.2,10.2,10.3,10.5,10.8,9.2,20.3,50.3});
        main(new Integer[]{1,2,3,4,5,6,7,8,9});
    }
    public static void main(int[] args){
        System.out.println("I'm  overloaded integer main method");
        for (int i=0;i<args.length;i++){
            System.out.print(args[i]+" ");
        }

        System.out.println("\n"+Arrays.toString(args));
    }
    public static void main(char[] args){
        System.out.println("I'm overloaded character main method");
        for(char i:args){
            System.out.print(i+" ");
        }
    }

    public static void main(double[] args) {
        System.out.println("\nI'm overloaded double main method");
        System.out.println(Arrays.toString(args));
    }

    public static void main(Integer[] args) {
        System.out.println("I'm overloaded Integer wrapper class  main method");
        System.out.println(Arrays.toString(args));
    }

}
