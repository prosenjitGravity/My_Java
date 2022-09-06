package Exception_Handling;

class OwnCustomException extends Exception {
    OwnCustomException(String s){
        super(s);
    }
}
public class CustomException{
    public static void main(String[] args){
        try{
            throw new OwnCustomException("Unauthorized users");
        }catch(OwnCustomException ex){
            System.out.println("Something Went Wrong : "+ex);
        }
    }
}
