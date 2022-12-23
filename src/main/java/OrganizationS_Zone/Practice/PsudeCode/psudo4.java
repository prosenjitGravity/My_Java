package OrganizationS_Zone.Practice.PsudeCode;

public class psudo4 {
    public static void main(String[] args) {
        int pp=7,qq=2,rr=4;
        rr=pp+qq;
        if(qq<rr && (qq&rr)<(pp-qq)) {
            if ((qq ^ rr) < (pp + qq)) {
                qq = 2 + pp;
            } else if ((qq ^ rr) < pp) {
                qq = (qq + qq) + qq;
            }
        }
        qq=(3+8)&pp;
        System.out.println((pp+qq+rr));// output: 19
    }
}
