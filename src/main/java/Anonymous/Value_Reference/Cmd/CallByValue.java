package Anonymous.Value_Reference.Cmd;

public class CallByValue {
    public static void main(String[] args){
        int a=10,b=20;
        System.out.println(" Before swapping value is  a : "+a+" and b : "+b);
        swapFunction(a,b);
        System.out.println(" After swapping value is  a : "+a+" and b : "+b);
    }
    static void swapFunction(int x,int y){
        System.out.println("(inner) Before swapping value is  a : "+x+" and b : "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("(inner) After swapping value is  a : "+x+" and b : "+y);
    }
}
