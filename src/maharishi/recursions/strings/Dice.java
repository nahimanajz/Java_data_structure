package maharishi.recursions.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceArr("", 4));
    }

    private static ArrayList<String> diceArr(String processed, int target) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <=6 && i<= target ; i++) {
            list.addAll(diceArr(processed +i, target - i));
        }
        return list;

    }

    static void dice(String processed, int target) {
        if (target == 0) {
            System.out.println(processed);
            return;

        }
        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(processed + i, target -i);
        }
    }

}
