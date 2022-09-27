package Dynamic_Programming;

public class ClimbStairs {
    public static int Stairs(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return n;
        }
        int left=Stairs(n-1);
        int right=Stairs(n-2);
        return left+right;
    }
    public static void main(String[] args){
        System.out.println(Stairs(3));
    }
}
