package Competitive_Platform.LeetCode.Easy;

public class Deck_of_Cards {
    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
    }
    static public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1){
            return false;
        }
        for(int i=0;i<deck.length;i++){
            if(deck[i]!=deck[deck.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
