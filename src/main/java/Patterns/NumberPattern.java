package Patterns;

public class NumberPattern {
    public static void main(String[] args){
        int t=1;
        for (int i=0;i<4;i++){
            for (int j=i;j<4;j++){
                System.out.print(t+++" ");
            }
            System.out.println();
        }
    }
}
