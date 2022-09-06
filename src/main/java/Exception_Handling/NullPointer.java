package Exception_Handling;

public class NullPointer {
    public static void main(String[] args){
        try{
            String data=null;
            System.out.println(data.charAt(5));
        }catch(NullPointerException e){
            System.out.println("Something went wrong : "+e);
        }
    }
}
