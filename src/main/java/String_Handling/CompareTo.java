package String_Handling;

public class CompareTo {

    public static void main(String[] args){
        String str[]={"now", "is", "the",  "time" , "for" , "all" ,"good" ,"men",
                      "to" , "come" ,"to" ,"the" ,"aid" ,"of", "their", "country"};
        println(str);
        sortCompare(str);
        System.out.println("\n");
        println(str);
    }
    static void sortCompare(String [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[i])<0){
                    String temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
//            System.out.println(arr[i]);
        }
    }
     static void println(String arr[]){
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+" ");
            }else {
                System.out.print(".");
            }
        }
     }
}
