package Exception_Handling;

public class ClassNotFound {
    public static void main(String[] args){
        try{
            Class.forName("Scanner");
        }catch(ClassNotFoundException e){
            System.out.println("Something went wrong : "+e);
        }
    }
}
