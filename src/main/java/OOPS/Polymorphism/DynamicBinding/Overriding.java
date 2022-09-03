package OOPS.Polymorphism.DynamicBinding;

class Aim{
    String Information(String name,String company){
        return "Name : "+name+", Company : "+company;
    }
}
class Job extends Aim{
    String Information(String n,String c,int s){
        return "Name : "+n+", Company : "+c+", Salary : "+s;
    }
}
public class Overriding {
    public static void main(String[] args){
        Job j=new Job();
        System.out.println(j.Information("Prosenjit","Google"));
        System.out.println(j.Information("Prosenjit","Zycus",560000));
    }

}
