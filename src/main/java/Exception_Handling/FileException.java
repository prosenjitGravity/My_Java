package Exception_Handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class FileException {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        try{
            System.out.println("Enter the file location : ");
            String location=predator.nextLine();
            File f=new File(location);
            FileReader read=new FileReader(f);
            System.out.println("Search Successfully this file have in the directory");
        }catch(FileNotFoundException e){
            System.out.println("Something went wrong  : "+e);
        }
    }
}
