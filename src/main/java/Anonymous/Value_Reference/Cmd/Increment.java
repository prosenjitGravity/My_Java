package Anonymous.Value_Reference.Cmd;

public class Increment {
    public static void main(String[] args){
        int value =1;
        System.out.println("Value is  : "+value);
        System.out.println(incrementValue(value));
        System.out.println("Value is  : "+value);
    }
    static int incrementValue(int x){
        x++;
        return x;
    }

}
