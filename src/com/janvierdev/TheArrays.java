package com.janvierdev;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));

        // Numbers
        int[] numbers = {100, 200};
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        // Loop array reversely
        System.out.println("\n");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
        // method 3 for loop
        System.out.println("Method 4\n");

        for (String color : colors) {
            System.out.println(color);
        }
        // method 4  using stream
        Arrays.stream(colors).forEach(System.out::println);
    }
}
