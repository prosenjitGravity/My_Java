package LambdaExpression;

interface StringFunction {
    String func(String n);
}

class MyString {
    static String StringReverse(String str) {
        String result = " ";
        for (int i = str.length() - 1; i >= 0; --i) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class Static_Methods {
    static String StringOp(StringFunction sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String input = "Lambdas add power of java";
        String output;
        output = StringOp(MyString::StringReverse, input);
        System.out.println("output is : " + output);
    }
}
