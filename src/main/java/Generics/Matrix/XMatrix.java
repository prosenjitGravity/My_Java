package Generics.Matrix;

import java.util.Arrays;

class GenericsMatrix<T> {
    T[][] asMatrix;

    GenericsMatrix(T[][] asMatrix) {
        this.asMatrix = asMatrix;
    }

    T CreateMatrix() {
        for (int i = 0; i < asMatrix.length; i++) {
            for (int j = 0; j < asMatrix.length; j++) {
                System.out.print(asMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return (T) Arrays.toString(asMatrix);
    }
}

public class XMatrix {
    public static void main(String[] args) {
        GenericsMatrix<Integer> as = new GenericsMatrix<Integer>(new Integer[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(as.CreateMatrix());
    }

}