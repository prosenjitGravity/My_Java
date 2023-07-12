package Lambda_Expression;
interface culation{
    int add(int a,int b);
}
public class Cal {
    public static void main(String [] args){
        culation obj=(x,y)->x*y;
        System.out.println(obj.add(20,20));
    }
}
