package StreamAPI;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 5, 4, 3, 7, 8, 9, 1);
//        out.println(list);
        list.forEach(e -> {
                    out.print(e+" ");
                }
        );
    }
}
