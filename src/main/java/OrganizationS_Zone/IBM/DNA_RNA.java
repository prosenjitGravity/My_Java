package OrganizationS_Zone.IBM;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DNA_RNA {
    public static void main(String[] args)throws IOException{
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader predator=new BufferedReader(input);
        String binary= predator.readLine();
        codeDecode(binary);
    }
    public static void codeDecode(String binarySequence){
        String[] sequence=binarySequence.split("(?<=\\G.{3})");
        boolean isDNA="000".equals(sequence[0]);
        StringBuilder builder=new StringBuilder();
        for (int i=1;i< sequence.length;i++){
            String code=sequence[i];
            switch(code){
                case "001":builder.append("C");
                break;
                case "010": builder.append("G");
                break;
                case "011": builder.append("A");
                break;
                case "101":
                case "110":
                    if(isDNA){
                        builder.append("T");
                    }else{
                        builder.append("U");
                    }
                break;
            }
        }
        System.out.println(builder);
    }
}
