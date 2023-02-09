package Competitive_Platform.LeetCode;

public class Integer_To_Roman {
    public static void main(String[] args){
        System.out.println(intToRoman(3));
    }
    static public String intToRoman(int num) {
        int temp=num;
        String toRoman="";
        for (int i=0;i<=num;i++){
//            int rem=num%10;
            switch(i){
                case 1:
                     toRoman=toRoman+"I";
                break;
                case 5:
                     toRoman=toRoman+"V";
                     break;
                case 10:
                    toRoman=toRoman+"X";
                    break;
                case 50:
                    toRoman=toRoman+"L";
                    break;
                case 100:
                    toRoman=toRoman+"C";
                    break;
                case 500:
                    toRoman=toRoman+"D";
                     break;
                case 1000:
                    toRoman=toRoman+"M";
                    break;
            }
//            num/=10;
        }
        return toRoman;
    }
}
