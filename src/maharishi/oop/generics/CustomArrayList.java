package maharishi.oop.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int size = 0; // working as index value
    private static int DEFAULT_SIZE= 10;
    int[] data;
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
             temp[i]= data[i];
        }
        data = temp;
    }


    private boolean isFull() {
        return size == data.length;
    }
    void remove(){
        int removed = data[--size];
    }
    public int get(int index) {
        return data[index];
    }
    void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        /*
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(9);
         */
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);

        }

        System.out.println(list);

    }
}
