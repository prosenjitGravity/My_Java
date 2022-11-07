package OrganizationS_Zone.Flipkart;

import java.util.Arrays;
import java.util.Locale;

public class Serialize {                        // input : ["Hello","Prosenjit"]
    //
    public static void main(String[] args) {
        System.out.println(serializable(new String[]{"scaler", "academy"}));
        deserializable(serializable(new String[]{"scaler", "academy"}));

    }
    static String serializable(String[] arr) {    // input : ["Hello","Prosenjit"]
        String newString = "";                   // output : Hello5~Prosenjit9~;   this is the output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                newString += arr[i].charAt(j);
            }
            newString += arr[i].length() + "~";
        }
//        System.out.println("The new serialize is  : "+newString);
        return newString;
    }

    static void deserializable(String newData) {          // input : Hello5~Prosenjit9~;
                                                         // output : ["Hello","Prosenjit"] this is the output
        System.out.println(newData + " data length is : " + newData.length());
        String temp = "";
        String arr[]=new String[10];
        for (int i = 0; i < newData.length(); i++) {
            while (newData.charAt(i) == '~') {
                temp += newData.charAt(i);
            }
            arr[i]=temp;
        }
        System.out.println(Arrays.asList(arr));
    }
}

