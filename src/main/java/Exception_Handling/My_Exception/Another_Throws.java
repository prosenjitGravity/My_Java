package Exception_Handling.My_Exception;

public class Another_Throws {
    static void throwOne()throws IllegalAccessException{
        System.out.println("inside throwOne Exception ");
        throw new IllegalAccessException("cannot be null");
    }
    public static void main(String[] args){
        try{
            throwOne();
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
