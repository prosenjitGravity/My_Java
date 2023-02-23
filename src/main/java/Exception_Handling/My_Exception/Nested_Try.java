package Exception_Handling.My_Exception;

public class Nested_Try {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        try{
            System.out.println(args.length);
            int b=45/2;
            System.out.println("b is : "+b);
            try{
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
                try{
                    System.out.println("find : "+arr[15]);
                }catch(NullPointerException ex){
                    System.out.println("Something went wrong : "+ex);
                }
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Something went Wrong : "+ex);
            }
        }catch(Exception ex){
            System.out.println("Something went wrong : "+ex);
        }
    }
}
