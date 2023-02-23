package Exception_Handling.My_Exception;

class Create_Exception extends Exception{
    int details;
    Create_Exception(int details){
        this.details=details;
    }
    public  String toString(){
        return "[Create_Exception "+details+" ]";
    }
}
public class Own_Demo {
    static void compute(int a) throws Create_Exception{
        System.out.println("called a is  : [ "+a+" ]");
        if(a>10){
            throw new Create_Exception(a);
        }
        System.out.println("simple text");
    }
    public static void main(String[] args){
        try{
            compute(21);
            compute(2);
        }catch(Create_Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
