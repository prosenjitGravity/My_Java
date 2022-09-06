package Exception_Handling;

public class ArrayIndex {
    public static void main(String[] args){
        try{
            int arr[]=new int[10];
            arr[10]=22;
            System.out.println("the array index value is :  "+arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong : "+e);
        }
    }
}
