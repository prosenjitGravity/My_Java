package Arrays;

class Array <T>{
    T my;
    Array(T my){
        this.my=my;
    }
    T Reverse(){
        return (T) my.getClass();
    }

}
public class ArrayGenerics {
    public static void main(String[] args){
        Array<String> are= new Array<>("Java Generics");
        System.err.println(are.Reverse());
    }
}
