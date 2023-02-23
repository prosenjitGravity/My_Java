package OrganizationS_Zone.Deloitte;

/*
  in this code given me the String parameter;
* INPUT : abcde;
* OUTPUT : 12a1b1c2d3e5
           0+1+1+2+3+5=12;
           -+-+-+-+-+-=---
*/
public class StringFibonacci {
    public static void main(String[] prosenjit){
        System.out.println(Create_new_String("abcde"));
    }
    static String Create_new_String(String s){
        int a=0,b=1,sum=0;
        for(int i=0;i<s.length();i++){
            int c=a+b;
                a=b;
                b=c;
                sum+=a;
        }
//        System.out.println("sum : "+sum);
        String newString=""+sum;
        int x=0,y=1,z=0;
        for(int i=0;i<s.length();i++){
            z=x+y;
            x=y;
            y=z;
            newString+=s.charAt(i)+""+x;

        }
        return newString;
    }
}
