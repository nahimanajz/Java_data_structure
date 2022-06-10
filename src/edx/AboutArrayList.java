package edx;

import java.util.ArrayList;

public class AboutArrayList {
    public ArrayList<Integer> numbers = new ArrayList<>();
    public void addToFront(int newNumber){
        this.numbers.add(0, newNumber);

    }
    public void addToBack(int newNumber){
        this.numbers.add(newNumber);
    }
    public void addToIndex(int index, int newNumber){
        this.numbers.add(index, newNumber);
    }

    public static void main(String[] args) {
        AboutArrayList aal = new AboutArrayList();
        // adding element to the beginning of array list
        aal.addToFront(1);
        aal.addToFront(2);
        aal.addToFront(3);
        aal.addToFront(4);
        System.out.println(aal.numbers);


        //adding element to the end of array
        aal.addToBack(9);
        System.out.println(aal.numbers);

        //adding element to specific index
        aal.addToIndex(2, 10);
        System.out.println(aal.numbers);


    }
}
