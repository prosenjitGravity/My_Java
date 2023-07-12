package Competitive_Platform.LeetCode.Easy;

public class pow_recursion {
    public static void main(String[] args) {
        System.out.println(pow(2,5));
        pow(2,5);
    }
    public static int pow(double x,int y){
        if(y!=0){
            return (int) (x*pow(x,y-1));
        }
        return 1;
    }
}
