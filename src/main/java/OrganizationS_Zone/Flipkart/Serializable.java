package OrganizationS_Zone.Flipkart;

import java.util.Scanner;

public class Serializable {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("How many String you want : ");
        int n = predator.nextInt();
        String[] data = new String[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = predator.next();
        }
        System.out.println(getSerialize(data));
    }

    static String getSerialize(String[] arr) {
        String newString = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                newString += arr[i].charAt(j);
            }
            newString += arr[i].length() + "~";
        }
        return newString;
    }
}
