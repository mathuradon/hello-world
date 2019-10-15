package main.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8NewFeature {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Ramesh", 24));
        humans.add(new Human("Bhim", 21));
        humans.add(new Human("Jeevan", 32));
        humans.add(new Human("Ghamesh", 35));
        humans.add(new Human("Hari", 25));


        /**
         * Before Java 8
         */
        System.out.println("===============NOW IN JAVA 8=================");
        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Human human : humans) {
            System.out.println(human.getName() + "  "+ human.getAge());

        }

        /**
         * After Java 8
         */
        System.out.println("===============NOW IN JAVA 8=================");
        humans.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
        for (Human human : humans) {
            System.out.println(human.getName() + "  "+ human.getAge());

        }
        humans.sort((h1,h2) -> h1.getName().compareTo(h2.getName()));
    }
}
