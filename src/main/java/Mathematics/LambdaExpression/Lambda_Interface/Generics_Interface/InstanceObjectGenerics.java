package Mathematics.LambdaExpression.Lambda_Interface.Generics_Interface;

interface MyFun<T> {
    boolean TestFun(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean SameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceObjectGenerics {
    static <T> int counter(T[] value, MyFun<T> f, T v) {
        int count = 0;
        for (int i = 0; i < value.length; i++) {
            if (f.TestFun(value[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = 0;
        HighTemp[] weeklyHigh = {
                new HighTemp(80), new HighTemp(50),
                new HighTemp(90), new HighTemp(89),
        };
        count = counter(weeklyHigh, HighTemp::SameTemp, new HighTemp(89));
        System.out.println(count + "");
    }
}
