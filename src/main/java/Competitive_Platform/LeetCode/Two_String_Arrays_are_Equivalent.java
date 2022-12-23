package Competitive_Platform.LeetCode;

public class Two_String_Arrays_are_Equivalent {
    public static void main(String[] args){
        System.out.println(isEquivalent(new String[]{"a", "cb"},new String[]{"ab", "c"}));
    }
    static boolean isEquivalent(String word1[],String word2[]){
        String storage1="";
        String storage2="";
        for(String i:word1){
            storage1+=i;
        }
        for(String j:word2){
            storage2+=j;
        }
        System.out.println("The first storage is  : "+storage1);
        System.out.println("The second storage is  : "+storage2);
        if(!storage1.equals(storage2)){
            return false;
        }
        return true;
    }
}
