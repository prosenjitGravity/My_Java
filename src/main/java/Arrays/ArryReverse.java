package Arrays;

public class ArryReverse {
    static final public void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<= arr.length-1;i++){
            int front=i;
            int rear=arr.length-i-1;
            if(front>rear){
                int temp=arr[front];
                arr[front]=arr[rear];
                arr[rear]=temp;
//                front++;
//                rear--;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
