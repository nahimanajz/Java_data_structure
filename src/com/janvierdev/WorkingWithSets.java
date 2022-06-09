package com.janvierdev;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Sets has no duplicates and they cannot go on order
 */
public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.forEach(System.out::println);

    }
    static class Ball {
        String color;
        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return  true;
            if(obj == null || getClass() != obj.getClass()) return true;
            Ball ball = (Ball) obj;
            return Objects.equals(color, ball.color);
        }
        @Override
        public int hashCode(){
            return Objects.hash(color);
        }
    }
    /*record  Ball(String color) {

    }

     */
}
