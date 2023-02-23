package Competitive_Platform.LeetCode.Easy;

import java.util.Objects;
import java.util.StringTokenizer;

public class Number_of_Segments {
    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
        System.out.println(countSegments1(", , , ,        a, eaefa"));
    }

    static public int countSegments(String s) {
        String[] arr = s.split(" ");
        int count = 0;
        for (String i:arr) {
            if (!Objects.equals(i,"")){
                count++;
            }
        }
        return count;
    }
    static public int countSegments1(String s) {
        int c=0;
        StringTokenizer token=new StringTokenizer(s," ");
        while(token.hasMoreTokens()){
            c++;
            token.nextToken();
        }
        return c;
    }
}
