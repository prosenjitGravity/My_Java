package Exception_Handling;

public class IllegalArgu {
    public static void main(String[] args){
        int a=15;
        if(a>=18){
            System.out.println("Eligible for voting");
        }
        else{
            throw new IllegalArgumentException("Not Eligible");
        }
    }
}
