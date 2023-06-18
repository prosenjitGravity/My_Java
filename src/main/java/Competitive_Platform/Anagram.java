package Competitive_Platform;

public class Anagram {
    public static void main(String[] args){
        System.out.println(isAnagram("listen","silent"));
    }
    static boolean isAnagram(String s1,String s2){
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        if(arr1.length!=arr2.length) {
            return false;
        }else{
            sorting(arr1);
            sorting(arr2);
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }
    static void println(char[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void sorting(char[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    char temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        println(array);
    }
}
