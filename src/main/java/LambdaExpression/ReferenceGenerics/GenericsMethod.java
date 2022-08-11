package LambdaExpression.ReferenceGenerics;

interface MyFunction<T> {
    int fun(T[] vals, T v);
}

class MyArrayOps {
    static <T> int CountMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}
public class GenericsMethod{
    static int count=0;
    static <T> int myOps(MyFunction<T> f,T[] vals,T v){
        return f.fun(vals,v);
    }
    public static void main(String[] args){
        count=myOps(MyArrayOps::<Integer>CountMatching,new Integer[]{1,2,3,4,5,6,7,8},4);
        System.out.println(count+" ");
    }
}
