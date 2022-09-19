package Arrays;

public class Max {
    public static void main(String[] args) {
        PrintTwoMax(new int[]{1,2,3,4,5,6,7,8,9});
    }
    static void PrintTwoMax(int arr[]){
        int f=0;
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>f) {
                s = f;
//                System.out.println(s + " = " + f);
                f = arr[i];
//                System.out.println(f);

            }else if(s<arr[i]){
                s=arr[i];
                System.out.println("Else  : "+s+" = "+arr[i]);
            }
        }
        System.out.println(f+", "+s);
    }
}
