package Exception_Handling.Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

class Create_Exception extends Exception {
    public Create_Exception(String exception) {
        super(exception);
    }
}

public class Create_Custom_Exception {
    public static void main(String[] args) throws IOException {
        try (BufferedReader predator = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("enter the  address : ");
            String address = predator.readLine();
            File myFile = new File(address);
            if (!myFile.isFile()) {
                throw new Create_Exception("Sorry File Not Found");
            } else {
                FileReader readMySelf = new FileReader(myFile);
                String read_line_by_line;
                int c = 0;
                BufferedReader reader = new BufferedReader(readMySelf);
                while ((read_line_by_line = reader.readLine()) != null) {
                    System.out.println(++c + " " + read_line_by_line);
                }
            }
        } catch (Create_Exception ex) {
            System.out.println("Something went wrong : " + ex.getMessage());
        }
    }
}
