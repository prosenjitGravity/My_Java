package Java_Features.KeyWord_Java.Super;
class Person{
    void message(){
        System.out.println("Hello I'm Person Class");
    }
}
class Student extends Person{
    void message(){
        System.out.println("Hello I'm  Student Class");
    }
    void Monitoring(){
        super.message();
        message();
    }
}
public class SuperWithMethods {
    public static void main(String[] args){
        Student is=new Student();
        is.message();
        is.Monitoring();
    }
}
