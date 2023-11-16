package Competitive_Platform.LeetCode.Medium;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public static void main(String[] args){
        letterCombinations("23");
    }
//    List<String>

    static public void letterCombinations(String digits) {
        Map<String,String> map=new HashMap<>();
        map.put("1","");
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9", "wxyz");
        System.out.println("The HashMap is  : "+map);
        for( int i =0 ; i < digits.length();i++){
            System.out.println("Map value : "+ map.get(String.valueOf(digits.charAt(i))));
        }
    }
}
