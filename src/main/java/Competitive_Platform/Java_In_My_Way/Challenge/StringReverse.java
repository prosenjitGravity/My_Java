package Competitive_Platform.Java_In_My_Way.Challenge;


/*
* input : i like this program very much
* output : much very program this like i*/
public class StringReverse {
    public static void main(String[] args){
      System.out.println(reverseManipulation("i like this program very much"));
    }
    static String reverseManipulation(String str){
        String[] arr=str.split(" ");
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            builder.append(arr[arr.length-1-i]+" ");
        }
//        System.out.println("the new String is  : "+builder);
        return builder.toString();
    }
}
