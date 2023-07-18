package Competitive_Platform.Java_In_My_Way;

public class Permutation {
    public static void main(String[] args){
        permutation("abc".toCharArray(),0);
    }
    static void permutation(char[] arr,int first){
        if(first==arr.length-1){
            System.out.println(arr);
            return ;
        }
        for(int i=first;i<arr.length;i++){
            swapping(arr,i,first);
            permutation(arr,first+1);
            swapping(arr,i,first);
        }
    }
    static void swapping(char[] character,int beg,int end){
        char temp=character[beg];
        character[beg]=character[end];
        character[end]=temp;
    }
}
