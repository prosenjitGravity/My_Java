package Aptitude;

class Generic1 <T>{
    private T[] arr;
    public Generic1(T[] arr) {
        this.arr=arr;
    }
    void println(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if (i!=arr.length-1){
                System.out.print(",");
            }
        }
    }
}
public class Generics{
    public static void main(String[] args){
        Generic1 h=new Generic1(new Object[]{1,2,3,4,5,6,7,8,});
        h.println();
        Generic1 i=new Generic1(new Object[]{"Hello","World"});
        i.println();
    }
}
