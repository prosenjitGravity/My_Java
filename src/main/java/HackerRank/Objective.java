package HackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Objective {
    public static void main(String[] args)throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(predator.readLine());
        for (int i=1;i<=10;i++){
            System.out.println(N+" x "+ i+" = "+i*N);
        }
    }
}
