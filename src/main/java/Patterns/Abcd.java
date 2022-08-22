package Patterns;

public class Abcd {
    public static void main(String[] args){
        for (char i='A';i<='Z';i++){
            for (char j='A';j<='Z';j++){
                System.out.print(j);
            }
            System.out.println();
        }
        char c='A';
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+c);
                c++;
            }
            System.out.println();
        }
        char ch='A';
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+ch);
            }
            ch++;
            System.out.println();
        }
    }
}
