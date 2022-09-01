package BasicsHashing;

public class CountArrayElement {
    public static void main(String[] args){
        int[] arr=new int[]{10,5,10,15,10,5};
        boolean visited[]=new boolean[arr.length];
        for (int i=0;i<arr.length;i++){
            if (visited[i]==true){
                continue;
            }
            int count=1;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
                System.out.println("count  : "+count);
            }
            System.out.println(arr[i]+" : "+count);
        }
    }
}
