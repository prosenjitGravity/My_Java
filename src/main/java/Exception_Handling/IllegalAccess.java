package Exception_Handling;

public class IllegalAccess {
    static void IllegalException()throws IllegalAccessException{
        System.out.println("Inside the Function");
        throw new IllegalAccessException("Unauthenticated Users Access");
    }
    public static void main(String[] args){
        try{
            IllegalException();
        }catch(IllegalAccessException e){
            System.out.println("Something went wrong : "+e);
        }
    }
}
