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
    }
}
