package Java_Features.KeyWord_Java.Super;

class Bike{
    int maxSpeed=400;
}
class Brand extends Bike{
     int maxSpeed=300;
     public /*static*/ void ModelName(){
        System.out.println("Current class maxSpeed Value is  : "+this.maxSpeed);
        System.out.println("Kawasaki ninja H2 Max Speed is : "+super.maxSpeed);
        System.out.println("Kawasaki ninja 650cc Max Speed is  : "+maxSpeed);
    }
}
public class SuperWithVariable {
    public static void main(String[] args){
        Brand are=new Brand();
        are.ModelName();
    }
}
