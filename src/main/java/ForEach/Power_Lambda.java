package ForEach;

interface Math{
    int pow(int base,int exponents);
}
public class Power_Lambda {
    public static void main(String[] args){
        Math math;
        math=(x,y)->{
            int res=1;
            for(int i=0;i<y;i++){
                res*=x;
            }
            return res;
        };
        System.out.println(math.pow(2,5));
    }
}
