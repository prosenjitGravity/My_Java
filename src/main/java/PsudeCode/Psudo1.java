package PsudeCode;

public class Psudo1 {
    public static void main(String[] args){
      int p=6,q=4,r=6;
      for (r=3;r<7;r++){
          if((p+q+r)>(r+q)){
              continue;
          }
          q=5+r;
          p=p+p;
      }
        System.out.println((p+q)); // output: 10
    }
}
