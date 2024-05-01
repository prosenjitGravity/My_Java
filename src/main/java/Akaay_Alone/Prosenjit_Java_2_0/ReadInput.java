package Akaay_Alone.Prosenjit_Java_2_0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException;
public class ReadInput {
    public static String read_Input(){
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        try {
            return predator.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
