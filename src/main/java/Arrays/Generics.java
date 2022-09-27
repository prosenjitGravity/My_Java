package Arrays;
import java.util.Arrays;
class Calculate<T>{
    T arr[][];
    T Transpose(T arr[][]){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        return (T) Arrays.toString(arr);
    }
}
public class Generics {
    public static void main(String[] args){
        Calculate<Object> are=new Calculate<>();
        System.out.println(are.Transpose(new Integer[][]{{1,2,3},{4,5,6},{7,8,9}}));
        are.Transpose(new Integer[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
