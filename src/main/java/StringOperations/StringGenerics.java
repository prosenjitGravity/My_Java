package StringOperations;

public class StringGenerics <Object>{
    public static void main(String[] args){
       StringGenerics<String> are=new StringGenerics<>();
        System.out.println(are.Reverse("Hello Java Generics World"));
    }
    Object Reverse(Object data) {
        return data;
    }
}
