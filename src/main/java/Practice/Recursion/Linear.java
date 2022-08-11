package Practice.Recursion;

public class Linear {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4, 5, 6, 71, 40, 90, 100, 500, 800};
        int target = 5000;
        System.out.println(search(array,0, target));
    }

    static int search(int arr[],int i, int target) {
        if(i==arr.length-1){
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return search(arr,i+1,target);
    }
}
