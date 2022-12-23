package Anonymous.Value_Reference.Cmd;

public class CallByReference {
    int p, q;

    public static void main(String[] args) {
        CallByReference by = new CallByReference();
        by.p = 50;
        by.q = 60;
        System.out.println("Before swapped The value of p : " + by.p + " and q : " + by.q);
        by.swapFunction(by);
        System.out.println("After swapped The value of p : " + by.p + " and q : " + by.q);
    }

    void swapFunction(CallByReference take) {
        take.p = take.p + take.q;
        take.q = take.p - take.q;
        take.p = take.p - take.q;
    }
}
