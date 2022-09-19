package OrganizationS_Zone.TCS;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        String data = predator.nextLine();
        int count =0;
        boolean[] visit = new boolean[data.length()-1];
        for (int i = 0; i < data.length(); i++) {
//            if ((i <= (data.length() - 1)) && !visit) {
                visit[i] =true;
                count++;
            }
        }
//        System.out.println(count);
//        System.out.println(Arrays.asList(visit));
//    }
}
