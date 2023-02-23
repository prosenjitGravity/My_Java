package Exception_Handling.My_Exception;

public class ThrowDemo {
    static void demoProc(){
        try{
            throw new NullPointerException("Cannot be null");
        }catch(NullPointerException ex){
            System.out.println("Something went wrong : ");
            throw ex;
        }
    }
    public static void main(String[] args){
        try{
            demoProc();
        }catch(NullPointerException ex){
            System.out.println("re-catch Exception : "+ex);
        }
    }
}
