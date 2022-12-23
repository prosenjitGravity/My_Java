package OrganizationS_Zone.Practice.Recursion.Recursion;

public class Sum {
    public static void main(String[] args){
        summation(10,0);
    }
    static void summation(int start,int end){
        if(start<1){
            System.out.println(end);
            return;
        }
//        System.out.println();
        summation(start-1,end+start);
    }

}
