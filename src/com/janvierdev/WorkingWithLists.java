package com.janvierdev;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>(); // LinkedList, would work likely as well
        colors.add("blue");
        colors.add("purple");
        colors.add("Tomato ");
        System.out.println(colors.contains("blue"));
        System.out.println(colors.size());
        System.out.println(colors);

        colors.forEach(System.out::println);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        // second method of making list it immutable= not changeable
       // List<String> colorsUnmodifiable = List.of("Blue", "Yellow");

    }
}
