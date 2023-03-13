package String_Handling.SubString;

public class StringReplace {
    public static void main(String[] args){
        String str="This is Test, This is too";
        String search ="is";
        String sub="was";
        String result="";
        int find;
        do{
            System.out.println("the String i s : "+str);
            find=str.indexOf(search);
            if(find!=-1){
                result=str.substring(0,find);
                result=result+sub;
                result=result+str.substring(find+search.length());
                str=result;
            }
        }while(find!=-1);
        System.out.println("after update the string is  : ");

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.toCharArray());
    }
}
