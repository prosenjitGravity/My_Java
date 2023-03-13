package Competitive_Platform.HackerRank;
import java.util.StringTokenizer;
public class StringSplit {
    public static void main(String[] args){
        getString("He is a very very good boy, isn't he?");
    }
    static void getString(String data){
        StringTokenizer token=new StringTokenizer(data,"-!_@#$%^&*(). ,?'");
        System.out.println(token.countTokens());
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
    }
}
