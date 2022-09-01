package StringOperations;

public class RemoveDuplicate {
    public static void main(String[] args){
        String s="helloeinstein";
        String newString=""+s.charAt(0);
        for (int i=0;i<s.length();i++){
            if(!newString.contains(String.valueOf(s.charAt(i)))){
                newString=newString+s.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
