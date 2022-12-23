package Java_Features.Keywords.This;

class Parameter{
    void fun(Parameter parameter){
        System.out.println("This  received the object");
    }
    void fun1(){
        fun(this);
    }
}
public class ParameterThis {
    public static void main(String[] args){
        Parameter obj=new Parameter();
        obj.fun1();
    }
}
