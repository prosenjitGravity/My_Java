package LambdaExpression.Lambda_Interface;

interface Arrays<T> {
    T[] ArrayElement(T[] arr);
}

public class LambdaArray {
    public static void main(String[] generics) {
        Arrays<Integer> genericsArr;
        genericsArr = (arr) -> {
            for (Integer i : arr) {
                System.out.print(i + " ");
            }
            return null;
        };
        System.out.println(genericsArr.ArrayElement(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
