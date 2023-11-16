package DSAlgo.LinearDSA.Arrays;

class Dynamic{
    private int arr[];
    private int count;
    public Dynamic(int length){
        arr=new int[length];
    }
    public void insertDynamic(int element){
        if(arr.length==count){
            int newArr[]=new int[2*count];
            for(int i=0;i<count;i++){
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        arr[count++]=element;
    }
    void printArray(){
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class Dynamic_Array{
    public static void main(String[] args) {
        Dynamic dynamic=new Dynamic(5);
        dynamic.insertDynamic(1);
        dynamic.insertDynamic(2);
        dynamic.insertDynamic(3);
        dynamic.insertDynamic(4);
        dynamic.insertDynamic(5);
        dynamic.insertDynamic(6);
        dynamic.insertDynamic(7);
        dynamic.insertDynamic(8);
        dynamic.insertDynamic(9);
        dynamic.insertDynamic(10);
        dynamic.printArray();
    }

}