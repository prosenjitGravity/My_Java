package Competitive_Platform.HackerRank;

class Add{
    static void add(int ...n){
        System.out.println("length of n is  : "+n.length);
        int sum=0;
        for(int i=0;i<=n.length;i++){
            for(int j=0;j<i;j++){
                System.out.print(n[j]+"+");
                sum+=n[j];
            }
            System.out.println("="+sum);
            sum=0;
        }

    }
}
public class Varargs {
    public static void main(String[] args) {

        Add a = new Add();
        a.add(1,2,3,4,5,6);
    }
}
