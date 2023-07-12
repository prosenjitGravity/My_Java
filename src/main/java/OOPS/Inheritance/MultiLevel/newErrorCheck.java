package OOPS.Inheritance.MultiLevel;

class unknown {
    void area(int x){
        System.out.println("unknown class area method"+5);
    }
}
class square extends unknown{
    @Override
     void  area(int x) {
        System.out.println("this is square area methods : "+(x*x));
    }
}
public class newErrorCheck {
    static public void main(String[] args){
        square s=new square();
        s.area(5);
    }
}
