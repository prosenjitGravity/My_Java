package Arrays;

public class DuplicateVisit {
    public static void main(String[] args){
        int arr[]=new int[]{9,1,2,3,45,9,6,7,8,9};
//        boolean[] visited=new boolean[arr.length];
        int b=0,e=arr.length-1,count=1;
        while(b<=e){
            if(arr[b]==arr[e]){
                count++;
                System.out.println(count+" times : "+arr[b]);
            }
            b++;
            e--;
        }
        System.out.println(count);

    }
}
