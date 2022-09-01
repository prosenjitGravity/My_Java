package Dynamic_Programming;

public class MaximumSum {
    public static void main(String[] args){
        int arr[]=new int[]{5, 20, 15, -2, 18};
        System.out.println(maxSubsetSumNoAdjacent(arr));
    }
    public static int maxSubsetSumNoAdjacent(int[] array) {
        return  findMaxSum(array,0);
    }
    static int findMaxSum(int[] array,int index){
        if(index >= array.length){
            return 0;
        }
        int bestWith = array[index]+findMaxSum(array,index+2);
        int bestWithout = findMaxSum(array,index+1);

        return Math.max(bestWith,bestWithout);
    }
}
