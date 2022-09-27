package OrganizationS_Zone.TCS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the 1st String : ");
        String s1 = predator.readLine();
        System.out.print("\nEnter the 2nd String  : ");
        String s2 = predator.readLine();
        System.out.println(isAnagram(s1, s2));
    }

    static boolean isAnagram(String x, String y) {
        char[] arr1=x.toCharArray();
        char arr2[]=y.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
