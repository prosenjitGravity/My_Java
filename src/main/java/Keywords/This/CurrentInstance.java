package Keywords.This;
class Instance{
    Instance fun(){
        return this;
    }
    void fun1(){
        System.out.println("inside fun1 method : ");
    }
}
public class CurrentInstance {
    public final static void main(String[] args){
        Instance g=new Instance();
        g.fun().fun1();
    }
}
