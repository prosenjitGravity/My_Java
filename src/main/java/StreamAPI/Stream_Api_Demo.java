package StreamAPI;

import java.util.Arrays;
import java.util.List;
import static java.lang.System.out;

public class Stream_Api_Demo {
    public static void main(String[] args) {
        work_stream_api();
    }
    static void work_stream_api(){
        List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7);
        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .map(n -> n * 2)
                .reduce(0,(c,e)->c+e);

        out.println("result : "+result);
    }
}
