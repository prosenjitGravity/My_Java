package String_Handling.StringBuffer;

/*   +----------------------------------------------------------------------------------------------------+
|    |                              equals() Versus ==                                                    |
     |   It is important to understand that the equals() method and the == operator perform two           |
     |   different operations. As just explained, the equals() method compares the characters inside      |
     |   a String object. The == operator compares two object references to see whether they refer        |
     |   to the same instance. The following program shows how two different String objects can           |
     |   contain the same characters, but references to these objects will not compare as equal:          |
*    +----------------------------------------------------------------------------------------------------+
*/
public class Equals_Operator {
    public static void main(String[] args){
        String s="Prosenjit";
        String str=new String("Prosenjit");
        System.out.println(s==str);
        System.out.println(s.equals(str));
        System.out.println("Because str is "+str.getClass()+"    and s is : "+s.getClass());

        System.out.println(str+" String  j index is : "+s.indexOf('j'));
        String s1="Now is the time for all good man "+
                  "to come to the aid of their country";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.lastIndexOf('t'));
        System.out.println(s1.indexOf("their",12));
    }
}
