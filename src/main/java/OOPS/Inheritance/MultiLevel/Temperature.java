package OOPS.Inheritance.MultiLevel;
import java.util.Scanner;
class  ConverterA{
    int value;
    ConverterA(int value){
        this.value=value;
    }
    int fahrenheitTOcelsius(){
        int result= (int) ((value-32)/1.8);
//        System.out.println(value+" Fahrenheit means "+result+" degree C");
        return result;
    }
    int celsiusTOfahrenheit(){
        int result1=(int)(fahrenheitTOcelsius()*1.8)+32;
//        System.out.println(fahrenheitTOcelsius()+" Celsius means "+result1+" degree F");
        return result1;
    }
}
class ConverterB extends ConverterA{

    ConverterB(int value) {
        super(value);
    }

    int fahrenheitTOkelvin(){
        return (int) (fahrenheitTOcelsius()+273);
    }
    int kelvinTOfahrenheit(){
        return (int)(1.8*(fahrenheitTOkelvin()-273))+32;
    }
}
class ConverterC extends ConverterB{
    ConverterC(int value) {
        super(value);
    }
    int celsiusTOkelvin(){
        return (int)(fahrenheitTOcelsius()+273);
    }
    int kelvinTOcelsius(){
        return (int)(celsiusTOkelvin()-273);
    }
}
public class Temperature {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the value :  ");
        int n=predator.nextInt();
        ConverterC c=new ConverterC(n);
        System.out.println(n+" degreeFahrenheit : "+c.fahrenheitTOcelsius()+" degree Celsius");
        System.out.println(c.fahrenheitTOcelsius()+" degree Celsius : "+c.celsiusTOfahrenheit()+" degree Fahrenheit");
        System.out.println(c.celsiusTOfahrenheit()+" degree Fahrenheit : "+c.fahrenheitTOkelvin()+" Kelvin");
        System.out.println(c.fahrenheitTOkelvin()+"  Kelvin : "+c.kelvinTOfahrenheit()+" degree Fahrenheit");
        System.out.println(c.fahrenheitTOcelsius()+" degree Celsius : "+c.celsiusTOkelvin()+"  Kelvin");
        System.out.println(c.celsiusTOkelvin()+" kelvin  : "+c.kelvinTOcelsius()+" degree Celsius");
    }
}
