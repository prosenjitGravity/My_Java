package Competitive_Platform.LeetCode;

public class Revarse_Word {
    public static void main(String[] args){
        System.out.println(Reverse("the sky is blue"));
//        Reverse1("the sky is blue");
    }
    static String Reverse(String s){
        String str="",temp="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                str+=s.charAt(i);
            }else{
                str+=" ";
            }
        }
//        System.out.println(str);
        String[] arr=str.split(" ");
//        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            StringBuffer sb=new StringBuffer(arr[i]);
            temp+=sb.reverse();
            if(i<arr.length){
                temp+=" ";
            }
        }
        return temp;
    }



    static void Reverse1(String str){
        String s="",temp="", newString="";
        for (int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                s+=str.charAt(i);
            }else{
                s+=" ";
            }
        }
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                temp+=s.charAt(i);
            }else{
                StringBuilder sb=new StringBuilder(temp);
                newString+=sb.reverse()+" ";
            }
        }
        System.out.println(newString);
    }
}
