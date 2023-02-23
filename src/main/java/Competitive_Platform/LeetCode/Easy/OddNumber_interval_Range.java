package Competitive_Platform.LeetCode.Easy;

public class OddNumber_interval_Range {
    public static void main(String[] args){
        System.out.println(countOdd1(3,7));
        System.out.println(countOdd2(3,7));
    }
    static int countOdd1(int low ,int high){
        int count=0;
        for(int i=low;i<=high;i++){
            if(i%2==1){
                ++count;
            }
        }
        return count;
    }
    static int countOdd2(int low ,int high){
        int total=high-low+1;
        if(total%2==0){
            return total/2;
        }else if(low%2!=0){
            return total/2+1;
        }else{
            return total/2;
        }
    }
}
