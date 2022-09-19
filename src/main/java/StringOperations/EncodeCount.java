package StringOperations;

public class EncodeCount {
    public static void main(String[] args){
        String data="wwwweeeerrrtittttyyyuuuuuiiiopp";
        int count=0;
        char temp=0;
        char arr[]=data.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(temp!=arr[i]){
                if(count!=0){
                    System.out.println(temp+" - "+count);
                }
                temp=arr[i];
                count=1;
            }else{
                count++;
            }
        }
        System.out.println(temp+" - "+count);
    }
}
