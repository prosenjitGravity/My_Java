package Anonymous.Value_Reference;

import java.util.Scanner;

class wrapper {
    int a;

    wrapper(int a) {
        this.a = a;
    }
}

public class Call_By_Reference {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter the 1st element : ");
        int a = predator.nextInt();
        System.out.println("Enter the 2nd element : ");
        int b = predator.nextInt();
        wrapper obj1 = new wrapper(a);
        wrapper obj2 = new wrapper(b);
        System.out.println("Before Swapping the elements are : a = " + obj1.a + " and b = " + obj2.a);
        swapping_data(obj1, obj2);
        System.out.println("After Swapping the elements are : a = " + obj1.a + " and b = " + obj2.a);
    }

    static void swapping_data(wrapper x, wrapper y) {
        wrapper temp = new wrapper(x.a);
        x.a = y.a;
        y.a = temp.a;
    }
}
