package String_Handling;

class Box{
    double width;
    double height;
    double depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }

    @Override
    public String toString() {
        return "Dimension are : "+width+" by "+depth+" by "+height;
    }
}
public class StringConversion {
    public static void main(String[] args){
        Box b=new Box(10,12,14);
        String s="box b : "+b;
        System.out.println("the b is  : "+b);
        System.out.println("the s is  : "+s);
    }
}
