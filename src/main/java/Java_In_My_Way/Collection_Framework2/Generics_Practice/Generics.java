package Java_In_My_Way.Collection_Framework2.Generics_Practice;

public class Generics<T> {
    private T[] array;
    private  int size;
    public Generics(){
        size=0;
        array=(T[])new Object[100];
    }
    public void insert(T element){
        array[size++]=element;
    }
    public int size(){
        return size;
    }
    public T get(int position){
        return array[position];
    }
}
