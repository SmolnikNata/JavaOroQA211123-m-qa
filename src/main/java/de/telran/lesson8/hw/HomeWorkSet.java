package de.telran.lesson8.hw;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HomeWorkSet {
    public static void main(String[] args) {


        //1. Создать объекты TreeSet, HashSet и LinkedHashSet.
        //Просчитать время работы с большим количеством элементов (например 1000000) для каждого объекта по операциям:

        Set<Integer> setTree = new TreeSet<>(); // отсортированный вид на выходе.
        Set<Integer> setLinked = new LinkedHashSet<>();
        Set<Integer> setHash = new HashSet<>();

        //добавление

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            setTree.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("TreeSet add ,  time = " + (end - start));


         start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            setLinked.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedHashSet add ,  time = " + (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            setHash.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("HashSet add ,  time = " + (end - start));

        // удаление

         start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            setTree.remove(450_000);
        }
         end = System.currentTimeMillis();
        System.out.println("TreeSet remove ,  time = " + (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            setLinked.remove(450_000);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedHashSet remove ,  time = " + (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            setHash.remove(450_000);
        }
        end = System.currentTimeMillis();
        System.out.println("HashSet remove ,  time = " + (end - start));

        // поиск эл-та

        start = System.currentTimeMillis();
        for (int i = 0; i < 400_000; i++) {
            setTree.contains(250_000);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet add ,  time = " + (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 5000_000; i++) {
            setLinked.contains(250_000);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedHashSet add ,  time = " + (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            setHash.contains(250_000);
        }
        end = System.currentTimeMillis();
        System.out.println("HashSet add ,  time = " + (end - start));


    }

}
