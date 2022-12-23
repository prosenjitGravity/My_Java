package Exception_Handling.FileHandling;

import java.io.*;

public class CreateFile {
    static BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        File file = null;
        try {
            file = new File("src/main/java/FileHandling/Create.java");
            if (file.createNewFile()) {
                System.out.println("Enter the data to be  insert into the " + file.getName());
                PrintWriter pw = new PrintWriter(file);
                pw.println(predator.readLine());
                pw.close();
                System.out.println(file+" is Created Successfully");
            }else{
                System.err.println(file.getName()+" Already Exist");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Something went wrong   : " + file + " is Already Exist in to the directory "+ex);
        }
    }
}
