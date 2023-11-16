package Strings.Tricks;

import java.util.Arrays;
import java.util.List;

public class String_Sorting {
    public static void main(String[] args) {
        System.out.println("All companies");
        System.out.println(sorting(new String[]{"Google","Microsoft","Atlassian",
                                                "IBM","Accenture","Zycus","TCS",
                                                "Wipro","Infosys","RedHat","Meta",
                                                "PWC","Amazon","Oracle","Flipkart",
                                                "Tech Mahindra","Morgan Stanley",
                                                "ServiceNow","Goldman Sachs"
                                               }));
    }
    static List<String> sorting(String[] s){
     for (int i=0;i<s.length;i++){
         for (int j=i+1;j<s.length;j++){
             if (s[i].compareTo(s[j])>0){
                 String temp=s[i];
                 s[i]=s[j];
                 s[j]=temp;
             }
         }
     }
     return Arrays.asList(s);
    }
}
