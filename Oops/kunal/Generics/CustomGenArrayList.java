package Oops.kunal.Generics;
// import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomGenArrayList(){
        // this.data = new T[DEFAULT_SIZE]; //T cannot give as type to arr coz it only convert it in compile time not at run time
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T n){
        if(isFull()){
            resize();
        }

        this.data[size++] = n;
    }
    private void resize(){

        Object[] temp = new Object[data.length * 2];

        // copy the current items in temp arr
        for(int i = 0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return this.size == this.data.length;
    }

    public T remove(){
        T removed = (T)( data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{ "+
        "date ="+Arrays.toString(data) +"Size = "+size +"}";
    }


    public static void main(String[] args) {

        CustomGenArrayList<Integer> arr = new CustomGenArrayList<>();
        for(int i = 0;i< 10;i++){
            arr.add(i * 2);
        }

        System.out.println(arr.toString());

    }
}