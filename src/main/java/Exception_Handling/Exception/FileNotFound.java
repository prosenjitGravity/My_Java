package Exception_Handling.Exception;

import java.io.*;

class MY_Exception extends Exception {
    public MY_Exception(String ex) {
        super(ex);
    }
}

public class FileNotFound {
    public static void main(String[] args) throws IOException {
        String address = "G:\\JavaInterviewDsa\\DSA\\Interview_Java\\src\\main\\java\\Exception_Handling\\Exception\\FileNotFound.java";
        try {
            File file = new File(address);
            if (!file.isFile()) {
                throw new MY_Exception("File not found into the drive ");
            } else {
                FileReader read = new FileReader(file);
                BufferedReader reader = new BufferedReader(read);
                String line;
                int c=0;
                while ((line = reader.readLine()) != null) {
                    System.out.println(++c +" "+line);
                }
            }
        } catch (MY_Exception e) {
            System.err.println("Something went Wrong : " + e.getMessage() + "please check spelling and continue");
        }
    }
}