package OrganizationS_Zone.Practice.Patterns;

public class Striver10 {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            for(int j=0;j<10-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<i;k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }
}
