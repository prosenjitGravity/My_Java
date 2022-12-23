package Competitive_Platform.HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(predator.readLine());
        double d = Double.parseDouble(predator.readLine());
        String s = predator.readLine();
        System.out.println(s + "\n" + d + "\n" + i);
    }
}
