package Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadFileException {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the directory location : ");
        String location = predator.readLine();
        FileReader read = new FileReader(location);
        BufferedReader reader = new BufferedReader(read);
        for (int i = 0; i < 100; i++) {
            System.out.println(reader.readLine());
        }
    }
}
