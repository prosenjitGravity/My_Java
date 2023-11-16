package Java_In_My_Way.Interview_Practice;

public class StringOperation {
    public static void main(String[] args) {
        String s1 = "Einstein";
        String s2 = "Einstein";
        boolean isTrue = s1 == s2;//true
        System.out.println("isTrue=s1==s2 : " + isTrue);// true
        System.out.println("s1==s2 is : " + s1 == s2); //false
        System.out.println(s1 + s2);
    }
}

/* why false ?
   The output of the given statement is false because the + operator has a higher precedence
   than the == operator. So the given expression is evaluated to “s1 == s2 is:abc” == “abc”,
   which is false.
* */