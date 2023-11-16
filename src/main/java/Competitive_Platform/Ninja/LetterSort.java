package Competitive_Platform.Ninja;

public class LetterSort {
    public static void main(String[] args){
        String str="string";
        sortData(str);

    }
    static void sortData(String s){
        int temp=0;
        char sort[]=s.toCharArray();
        for(int i =0;i<sort.length;i++){
            for(int j =i+1;j<sort.length;j++){
                if(sort[i]> sort[j]){
                   temp = sort[i];
                   sort[i] = sort[j];
                   sort[j]= (char) temp;
                }
            }
        }
        for(int i =0;i<sort.length;i++){
            System.out.println(sort[i]);
        }
    }
}
