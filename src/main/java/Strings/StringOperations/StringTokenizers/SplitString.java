package Strings.StringOperations.StringTokenizers;

public class SplitString {
    public static void main(String[] args){
        String str="hello @world";
        getString(str);
    }
    static void getString(String data){
        String arr[]=data.split("@",3);
        for(String i:arr){
            StringBuffer as=new StringBuffer(i);
            as.reverse();
            System.out.println(as);
        }
    }
}
