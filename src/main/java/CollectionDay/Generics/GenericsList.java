package CollectionDay.Generics;

import java.util.Iterator;

public class GenericsList<T> {
    private  T[] arrayList;
    private int size;
    public GenericsList(){
        arrayList=(T[]) new Object[100];
        size=0;
    }
    public void  add(T element){
        arrayList[size++]=element;
    }
    public int getIndex(int index){
        return (int) arrayList[index];
    }
    public int getSize(){
        return size;
    }
    public Iterator<T> iterator(){
        MyGenericsLstIterator allElement=new MyGenericsLstIterator(this);
        return allElement;
    }
    public class MyGenericsLstIterator implements Iterator<T>{
        private GenericsList<T> myList;
        private int index=0;
        public MyGenericsLstIterator(GenericsList<T> myList){
            this.myList=myList;
        }
        @Override
        public boolean hasNext() {
            return index<myList.getSize();
        }

        @Override
        public T next() {
            return (T) myList.arrayList[index++];
        }
    }
}
