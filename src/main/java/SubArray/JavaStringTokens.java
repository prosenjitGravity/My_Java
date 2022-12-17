package SubArray;

import java.util.StringTokenizer;

public class JavaStringTokens {
    public static void main(String[] args) {
        Token("He is a very very good boy, isn't he?");
    }
    static void Token(String s){
        StringTokenizer st=new StringTokenizer(s,"[A-Za-z !,?._'@ ]+");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
