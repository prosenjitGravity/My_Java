package OrganizationS_Zone.Practice.PsudeCode;

public class psudo17 {
    public static void main(String[] args) {
        int p=6,q=8,r=10;
        for (r=3;r<=6;r++){
            if((p+q)>(r-p)){
                continue;
            }
            q=p+r;
            q=(8+7)^p;
        }
        System.out.println((p+q));// output: 14;
    }
}
