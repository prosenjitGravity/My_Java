package LeetCode;

public class EncodedCount {
    public static void main(String[] args){
        print("aabbbccccffggg");
    }
    static void print(String s){
        char temp=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(temp!=s.charAt(i)){
                if(count!=0){
                    System.out.print(temp+""+count+" ");
                }
                temp=s.charAt(i);
                count=1;
            }
            else{
                count++;
            }
        }
        System.out.print(temp+""+count);
    }
}
