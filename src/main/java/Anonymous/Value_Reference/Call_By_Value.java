package Anonymous.Value_Reference;

import java.util.Scanner;

public class Call_By_Value {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the 1st element : ");
        int a=predator.nextInt();
        System.out.println("Enter the 2nd element : ");
        int b=predator.nextInt();
        System.out.println("Before Swapping the elements are : a = "+a+" and b = "+b);
        swapping_data(a,b);
        System.out.println("After Swapping the elements are : a = "+a+" and b = "+b);
    }
    static  void swapping_data(int x,int y){
        System.out.println(" inside swapping method Before Swapping the elements are : a = "+x+" and b = "+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("inside swapping method After Swapping the elements are : a = "+x+" and b = "+y);
    }
}
