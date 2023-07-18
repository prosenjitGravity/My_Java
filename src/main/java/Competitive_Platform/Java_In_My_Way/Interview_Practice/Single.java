package Competitive_Platform.Java_In_My_Way.Interview_Practice;

public class Single {
    public static void main(String[] args) {
        int[] arr=new int[]{4,2,1,2};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum^=arr[i];
        }
        System.out.println(sum);
    }
}
