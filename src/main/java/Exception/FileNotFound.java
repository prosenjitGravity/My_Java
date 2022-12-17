package Exception;

import java.io.*;

class MY_Exception extends Exception{
    public MY_Exception(String ex){
        super(ex);
    }
}
public class FileNotFound {
    public static void main(String[] args) throws IOException{
        String address="G:\\JavaInterviewDSA\\DSA\\Interview_Java\\src\\main\\java\\Exception\\FileNotFound.java";
        try {
            File file=new File(address);
            if(!file.isFile()){
                throw new MY_Exception("File not found into the drive.");
            }else {
                FileReader read = new FileReader(file);
                BufferedReader reader=new BufferedReader(read);
                for (int i = 0; i < 10; i++) {
                    System.out.println(reader.readLine());
                }
            }
        }
        catch (MY_Exception e) {
            System.err.println("Something went Wrong"+e.getMessage());
        }
    }

}
