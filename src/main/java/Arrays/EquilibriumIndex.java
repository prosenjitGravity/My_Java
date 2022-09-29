package Arrays;

public class EquilibriumIndex {
    public static void main(String[] args){
        System.out.println("Printing array : ");
        for(int i=0;i<getArr().length;i++){
            System.out.print(getArr()[i]+" ");
        }
        System.out.println("Now Equilibrium Array : ");
        for(int i=0;i<getArr().length;i++) {
           //
        }
    }
    static int[] getArr(){
        return new int[]{-7, 1, 5, 2, -4, 3, 0};
    }
}
