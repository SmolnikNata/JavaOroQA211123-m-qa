package de.telran.lesson_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleRelation {
    public static void main(String[] args) {

        List<Integer>listArray = new ArrayList<>();
        List<Integer>listLinked = new LinkedList<>();


        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listArray.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLinked.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

//        listArray.clear();
//        listLinked.clear();

        //в хвост

        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listArray.addLast(2);
        }

        end = System.currentTimeMillis();
        System.out.println(end - start);


        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLinked.addLast(2);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);


        // добавление в середину
        start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            listArray.add(100_000, i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList add Middle,  time = "+(end-start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            listArray.add(100_000, i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add Middle,  time = "+(end-start));
    }

}
