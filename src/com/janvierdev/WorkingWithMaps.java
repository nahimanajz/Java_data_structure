package com.janvierdev;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public void main(String[] args) {
    Map<Person, Diamond> map = new HashMap<>();
    map.put(new Person("Janvier"), new Diamond("African Diamond"));
        System.out.println(new Person("Jamila").hashCode());

    }
    private void maps(){
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Mistico"));
        map.put(3, new Person("Clement"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        map.remove(2);
        map.entrySet().forEach(x-> System.out.println(x.getKey() + " " +x.getValue()));
        map.forEach((key, person)->{
            System.out.println(key + " -"+ person);
        });
        System.out.println(map.getOrDefault(3, new Person("Default person")));
        System.out.println(map.values());

    }
    class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
        @Override
        public boolean equals(Object obj) {
            if(this == obj) return  true;
            if(obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name) {}

}
