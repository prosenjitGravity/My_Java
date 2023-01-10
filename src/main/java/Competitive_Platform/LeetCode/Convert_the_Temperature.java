package Competitive_Platform.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_the_Temperature {
    public static void main(String[] args){

    }
    static public double[] convertTemperature(double celsius) {
        double[] temperature=new double[2];
        for (int i=0;i<temperature.length;i++){
            if (i==0){
                temperature[i]=celsius+273.15;
            }else{
                temperature[i]=(celsius*1.80)+32.00;
            }
        }
        return temperature;
    }
}
