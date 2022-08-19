package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        char ch='A';
        for (int i=0;i<5;i++){
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<i;k++){
                if (k==0||k==3||k==5||k%2==0){
                    System.out.print(ch+" ");
                    ch++;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
