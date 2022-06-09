package com.janvierdev;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); //  get element at the top of stack or bucket
        System.out.println(stack.size()); //  length of stack
        System.out.println(stack.empty());  // return True|| false if stack is not empty



    }
}
