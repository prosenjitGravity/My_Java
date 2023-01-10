package Pattern_Print;

public class NewPattern {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
}

