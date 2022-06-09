package com.janvierdev;

import java.util.Arrays;

public class WorkingWith2DArray {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
        System.out.println(Arrays.deepToString(board));

        char [][] boardTwo = new char[][] {
                new char[] {'0','-', '-'},
                new char[] {'0','-', '-'},
                new char[] {'0','-', '-'}
        };
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
