package OrganizationS_Zone.Airbnb;

/*
 * Test Case : 1
 *              n=27 and output is 33
 * Explanation :  3^1 =3
 *                3^2 =9
 *                3^3 =27
 *                power 3 is 27
 *           the output is 33*/

public class PowerOf {
    public static void main(String[] args) {

        isPowerOf(81);
    }

    static void isPowerOf(int num) {
        boolean scheduleBreak = false;
        for (int base = 1; base <= num; base++) {
            for (int exponent = 0; exponent <= 10; exponent++) {
                if (num == power(base, exponent)) {
                    scheduleBreak = true;
                    System.out.println(base +""+exponent);
                }
            }
            if(scheduleBreak) {
                break;
            }
        }
    }

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
