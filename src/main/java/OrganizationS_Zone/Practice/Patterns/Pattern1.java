package OrganizationS_Zone.Practice.Patterns;

public class Pattern1 {
    public static void main(String[] args){
        char ch='A';
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(ch+" ");
//                ch++;
            }
            ch++;
            System.out.println();
        }
    }

}
