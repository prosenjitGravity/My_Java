package CollectionDay.Generics;

import java.util.Iterator;

public class GenericsMain {
    public static void main(String[] args){
        GenericsList<Integer> genericsList=new GenericsList<Integer>();
        genericsList.add(10);
        genericsList.add(11);
        genericsList.add(12);
        genericsList.add(13);
        genericsList.add(14);
        genericsList.add(15);
        genericsList.add(16);
        System.out.println(genericsList.getSize());
        System.out.println(genericsList.getIndex(4));
//        print all value on the genericsList
        for( int i=0;i<genericsList.getSize();i++){
            System.out.println(i+" : "+genericsList.getIndex(i));
        }
        System.out.println(genericsList.getClass() );
//        System.out.println(genericsList);
    }
}
