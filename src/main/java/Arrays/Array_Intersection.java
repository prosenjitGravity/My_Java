package Arrays;

public class Array_Intersection {
    public static void main(String[] args){
        System.out.println(intersection(new int[]{1,3,5},new int[]{3,7,9}));
        for(int i=0;i<intersection(new int[]{1,3,5},new int[]{3,7,9}).length;i++){
            System.out.println(intersection(new int[]{1,3,5},new int[]{3,7,9})[i]);
        }
    }
    static int[] intersection(int[] a,int[] b){
        int[] section =new int[10];
        int index=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]+" "+b[j]);
                    section[index]=a[i];
                    index++;
                }
            }
        }
        return section;
    }
}
