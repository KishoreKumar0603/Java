package Oops.kunal.Generics;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int n){
        if(isFull()){
            resize();
        }

        this.data[size++] = n;
    }
    private void resize(){

        int[] temp = new int[data.length * 2];

        // copy the current items in temp arr
        for(int i = 0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return this.size == this.data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{ "+
        "date ="+Arrays.toString(data) +"Size = "+size +"}";
    }


    public static void main(String[] args) {

        CustomArrayList arr = new CustomArrayList();
        arr.add(19);
        for(int i = 1;i<10;i++){
            arr.add(i*2);
        }

        System.out.println(arr.toString());

    }
}