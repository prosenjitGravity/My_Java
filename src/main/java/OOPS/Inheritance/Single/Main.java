package OOPS.Inheritance.Single;

public class Main {
    public static void main(String[] args) {
        Fahrenheit unit = new Fahrenheit(100);
        Celsius unit1 = new Celsius(212);
        System.out.println(unit.ConvertCtoF() + " degree F");
        System.out.println(unit1.ConvertFtoC() + " degree C");
    }
}
