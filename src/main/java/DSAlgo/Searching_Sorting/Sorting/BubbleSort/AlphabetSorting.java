package DSAlgo.Searching_Sorting.Sorting.BubbleSort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class AlphabetSorting {
    public static void main(String[] args)throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String : ");
        String data=predator.readLine();
        byte[] alphabet =data.getBytes();
        for(int i=0;i<alphabet.length;i++){
            for(int j=0;j<alphabet.length-1;j++){
                if(alphabet[j]>alphabet[j+1]){
//                    alphabet[j]= (Byte) (alphabet[j]^alphabet[j+1]);
//                    alphabet[j+1]=(Byte)(alphabet[j]^alphabet[j+1]);
//                    alphabet[j]=(Byte)(alphabet[j]^alphabet[j+1]);
                    int temp=alphabet[j];
                    alphabet[j]=alphabet[j+1];
                    alphabet[j+1]= (byte) temp;
                }
            }
        }
        for(int i=0;i<alphabet.length;i++){
            char ch= (char) alphabet[i];
            System.out.print(ch+" ");
        }
    }
}
