package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word_Sorting {
    public static void main(String[] args) {
        List<String> list= Arrays.asList(
                "Welcome","to","the" ,"Android", "developer" ,"guides.",
                "These","documents" ,"teach", "you", "how" ,"to", "build",
                "Android","apps" ,"using", "APIs", "in", "the", "Android" ,
                "framework" ,"and" ,"other" ,"libraries");
        List<String> takeArray=new ArrayList<String>();
        System.out.println("Before sorting");
        list.forEach(s->{
            takeArray.add(s);
            System.out.print(s+" ");
        });
        System.out.println("\nAfter sorting");
        //sorting all words in array list
        takeArray.sort((String s1,String s2)->{
           return s1.compareTo(s2);
        });
        takeArray.forEach(e->{
            System.out.print(e+" ");
        });
    }
}
