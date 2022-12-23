package OrganizationS_Zone.Practice.Patterns;

public class NestedPattern {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for (int j=0;j<=5-i;j++){
                System.out.print(" *");
            }
            for (int k=0;k<i;k++){
                System.out.print("    ");
            }
            for (int l=5-i;l>=0;l--){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=5;i>=0;i--){
            for (int j=0;j<=5-i;j++){
                System.out.print(" *");
            }
            for (int k=0;k<i;k++){
                System.out.print("    ");
            }
            for (int l=0;l<=5-i;l++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
