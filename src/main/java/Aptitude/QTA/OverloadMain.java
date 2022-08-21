package Aptitude.QTA;

public class OverloadMain {
    public static void main(String[] args){
        System.out.println("Hello world");
        OverloadMain.main("String args says");
        OverloadMain.main(1);
        OverloadMain.main();
        OverloadMain.main(new Integer[]{1,2,3,4,5,6,7,8,9});
    }
    public static void main(String arg){
        System.out.println("Hello world 1");
    }
    public static void main(int java){
        System.out.println("Hello integer");
    }
    public static void main(){
        System.out.println("Hello main no parameter");
    }
    public static void main(Integer[] args){
        System.out.println("Hello wrapper Integer[] class ");
        for (int i:args){
            System.out.print(i+" ");
        }
    }
}
