package Competitive_Platform.Java_In_My_Way.Arrays_Operation;
import java.util.Arrays;
import java.util.List;
public class Max_index_return {
    public static void main(String[] args){
        Max_index_return multi_rutern=new Max_index_return();
        System.out.println(multi_rutern.element_Index(new int[]{15,78,96,17,20,65,14,36,18,20}));
        System.out.println("its also working");
        System.out.println(element_Index(new int[]{15,78,96,17,20,65,14,36,18,20}));

    }
    static List<Object> element_Index(int arr[]){
        int max=arr[0],index=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return Arrays.asList(max,index);
    }
}
