package Aptitude.QTA;

public class MainOverloading {
    public static void main(String[] args){
        System.out.println("Default");
        main(new double[]{12.2,23.3,34.4,45.5});
        {
            System.out.println("now main method overload");
        }
    }
    {
        System.out.println("now main method overload");
    }
    public static void main(byte[] arg1){
        System.out.println("byte main methods");
    }
    public static void main(double[] arg1){
        System.out.println("doduble main methods");
    }
    public static void main(char[] arg1){
        System.out.println("character main methods");
    }
    public static void main(float[] arg1){
        System.out.println("float main methods");
    }
}
