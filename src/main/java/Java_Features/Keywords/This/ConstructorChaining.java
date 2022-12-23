package Java_Features.Keywords.This;
class SampleThis{
    SampleThis(){
        System.out.println("Hello World");
    }
    SampleThis(int a,int b){
        System.out.println(a+b);
    }
    SampleThis(String data){
        this(10,20);
        System.out.println(data+" third constructor called 2nd constructor ");
    }

}
public class ConstructorChaining {
    public static void main(String[] args){
        SampleThis a=new SampleThis();
        a=new SampleThis("prosenjit");

    }
}
