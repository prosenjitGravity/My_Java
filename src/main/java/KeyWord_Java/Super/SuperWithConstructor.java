package KeyWord_Java.Super;

class Person1{
    Person1(){
        System.out.println("Hello I'm person1 class");
    }
}
class Student1 extends Person1{
    Student1(){
        super();
        System.out.println("Hello I'm Student1 class");
    }
}
public class SuperWithConstructor {
    public static void main(String[] args){
        Person1 are =new Student1();
    }
}
