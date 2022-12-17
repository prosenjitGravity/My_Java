package Exception_Handling;
import java.io.*;
import java.util.Scanner;
public class FileException {
    public static void main(String[] args)throws IOException {
        Scanner predator=new Scanner(System.in);
        try{
            System.out.println("Enter the file location : ");
            String location=predator.nextLine();
            File f=new File(location);
            FileReader read=new FileReader(f);
            System.out.println("Search Successfully this file have in the directory");
            BufferedReader reader=new BufferedReader(read);
            for(int i=0;i<10;i++){
                System.out.println(reader.readLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("Something went wrong  : "+e);
        }
    }
}
