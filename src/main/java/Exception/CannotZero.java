package Exception;

class MyException extends Exception{
    public MyException(String ex){
        super(ex);
    }
}
public class CannotZero {
    public static void main(String[] args){
        System.out.println("Exception");
        int a = 100,b=20;
        try {
            int z=a/b;
            if(z==0) {
                throw new MyException("It Cannot be possible");
            }else{
                System.out.println(z);
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
