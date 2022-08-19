package CodeChef;

import java.util.Scanner;

public class HelloEquations {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int t=predator.nextInt();
        while(t-->0){
            int result=0;
            int x=predator.nextInt();
            if(x>0){
                 int v=0,v1=0;
                while(v>0){
                   result=(2*v)+(2*v)+(v*v);
                   v++;
                    if(result==x){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No");
                    }
                }
                v=v1;

            }
        }
    }
}
