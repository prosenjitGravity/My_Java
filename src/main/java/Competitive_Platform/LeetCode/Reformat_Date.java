package Competitive_Platform.LeetCode;

import java.util.StringTokenizer;

public class Reformat_Date {
    //    static String[] date=new String[]{"1st","2nd","3rd,"}
    public static void main(String[] args) {
        System.out.println(reformatDate("9th Oct 2052"));
    }

    public static String reformatDate(String date) {
        String[] arr = date.split(" ");
        StringBuilder builder = new StringBuilder();
        builder.append(arr[2]);
        builder.append("-");
        switch (arr[1]) {
            case "Jan":
                builder.append("01");
                break;
            case "Feb":
                builder.append("02");
                break;
            case "Mar":
                builder.append("03");
                break;
            case "Apr":
                builder.append("04");
                break;
            case "May":
                builder.append("05");
                break;
            case "Jun":
                builder.append("06");
                break;
            case "Jul":
                builder.append("07");
                break;
            case "Aug":
                builder.append("08");
                break;
            case "Sep":
                builder.append("09");
                break;
            case "Oct":
                builder.append("10");
                break;
            case "Nov":
                builder.append("11");
                break;
            case "Dec":
                builder.append("12");
                break;
        }
        builder.append("-");
        String str = arr[0];
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                newString = newString + str.charAt(i);
            }
        }
        if (Integer.parseInt(newString) >= 1 && Integer.parseInt(newString) <= 9) {
            builder.append(0+newString);
        }else{
            builder.append(newString);
        }
        return builder.toString();
    }
}
