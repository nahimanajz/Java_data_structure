package maharishi.oop.generics;

import java.util.Arrays;

// public class GenericArrayList<T extends Number> { // if you want number you would add just this.
// public class GenericArrayList<T ? extends Number> { extends Number class and it's subclass like Float
public class GenericArrayList<T> {

        private int size = 0; // working as index value
        private static int DEFAULT_SIZE= 10;
        private Object[] data;

    public GenericArrayList(){
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i]= (T) data[i];
        }
        data = temp;
    }
    private boolean isFull()  {
        return size == data.length;
    }
    public T remove(){
        T removed = (T) data[--size];
        return  removed;

    }
        public T get(int index) {
        return (T) data[index];
    }
    public void set(int index, T value){
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
