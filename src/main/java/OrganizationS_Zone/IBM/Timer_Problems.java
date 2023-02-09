package OrganizationS_Zone.IBM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Timer_Problems {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter time : ");
        MAX_MIN(predator.readLine());

    }

    static void MAX_MIN(String inputTimer) {
        Map<Integer, Integer> maxValueMap = new HashMap<>();
        maxValueMap.put(0, 2);
        maxValueMap.put(1, 9);
        maxValueMap.put(3, 5);
        maxValueMap.put(4, 9);
        maxValueMap.put(6, 5);
        maxValueMap.put(7, 9);
        int i = inputTimer.indexOf("@");
        int maxValue = maxValueMap.get(i);
        String min = inputTimer.replace("@", "0");
        String max = inputTimer.replace("@", String.valueOf(maxValue));
        if (i == 1 && inputTimer.charAt(0) == '2') {
            max = inputTimer.replace("@", "3");
        } else if (i == 0 && Integer.parseInt(String.valueOf(inputTimer.charAt(1))) > 3) {
            max = inputTimer.replace("@", "1");
        }
        System.out.println("MIN " + min);
        System.out.println("MAX " + max);
    }
}
