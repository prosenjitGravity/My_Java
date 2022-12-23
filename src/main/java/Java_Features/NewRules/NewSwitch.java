package Java_Features.NewRules;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NewSwitch {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        String option;
        do {
            System.out.println("choose the option : ");
            option = predator.readLine();
//            switch (option) {        // this switch never works because  java version 17 or latest version is required
//                case "Hello" -> System.out.println("Hello java");
//                case "sunday" -> System.out.println("weak up 8 A.M in the morning");
//                case "monday" -> System.out.println("");
//
//            }

        } while (!option.equals("quite"));
    }
}
