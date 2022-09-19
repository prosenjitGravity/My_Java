package StringTokenizers;

public class RemoveHash {
    public static void main(String[] args){
        System.out.println(Remove("Move#Hash#to#Front"));
    }
    static String Remove(String s){
        String ch="";
        String st="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                ch+= s.charAt(i);
            }else{
                st+=s.charAt(i);
            }
        }
        String result=ch+st;
        return result;
    }
}
