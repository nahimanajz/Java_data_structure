package com.janvierdev;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/**
 * Fifo: a collection designed for holding elements prior to processing
 */
public class WorkingWithQueue {
    public static void main(String[] args) {
       LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.add(new Person("Ali", 18));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }
    static record Person(String name, int age){
    }
    private static void queues(){
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll()); // removes
        System.out.println(supermarket.size());
    }
}
