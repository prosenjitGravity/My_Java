package OrganizationS_Zone.IBM;

import java.util.ArrayList;
import java.util.List;

public class Retrive_passcodes_from_Shredded_Sheet_papper {
    public static void main(String[] args){
        String[] arr=new String[]{"Hello","world"};
        retrievePasscodes(List.of(arr));
    }
    public static void retrievePasscodes(List<String> strips) {
        String[] array = new String[strips.size()];
        for(String line : strips) {
            int index = Integer.parseInt(""+line.charAt(0))-1;
            array[index] = line;
        }
        StringBuilder sb = new StringBuilder();
        int linelength = strips.get(0).length()-1;
        for(int i = 0; i<linelength; i++) {
            for (int j = 0; j < array.length; j++) {
                sb.append(array[j].charAt(i+1));
            }
            System.out.println(sb.toString());
            sb = new StringBuilder();
        }

    }
}
