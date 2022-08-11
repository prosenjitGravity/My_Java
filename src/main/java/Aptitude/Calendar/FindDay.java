package Aptitude.Calendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FindDay {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the year : ");
        int year = Integer.parseInt(predator.readLine());
        int leapyear = (year - 1) / 4;
        int non_leapyear = (year) - leapyear;
        System.out.println(leapyear + " LeapYear & " + non_leapyear + " Non-LeapYear");
        int total = (leapyear * 2) + (non_leapyear);
        int odddays = total % 7;
        System.out.println(year + " year have total " + odddays + " Odd days");
    }
}
