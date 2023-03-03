package In_My_Way;

public class StringCount {
    public static void main(String[] args) {
        getString("qqqqqqjjjnnbbb");
    }

    static void getString(String s) {
        char temp = ' ';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != temp) {
                if (count != 0) {
                    System.out.print(temp + "" + count);
                }
                temp = s.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println(temp + "" + count);
    }
}
