package Collection_Framework.ArrayList;

import java.util.*;

public class Array_lambda {
    public static void main(String[] args) {
//        Integer[] arr=new Integer []{1,2,3,4,5,6,7,8,9};
        List<String> array= Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G50","g64",
                "I26","I17","I29",
                "O71");

        List<String> getNumber=new ArrayList<>();
        array.forEach(n->{
            if(n.toUpperCase().startsWith("G")) {
                getNumber.add(n);
                System.out.println(n);
            }
        });
        System.out.println();
        getNumber.sort((String s1,String s2)-> {
            return s1.compareTo(s2);
        });
        getNumber.forEach(e->{
            System.out.println(e);
        });
    }
}
