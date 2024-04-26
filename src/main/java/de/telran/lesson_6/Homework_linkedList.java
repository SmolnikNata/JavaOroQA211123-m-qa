package de.telran.lesson_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Homework_linkedList {
    public static void main(String[] args) {

        // наполняем

        List<Integer> listArray = new ArrayList<>();
        List<Integer>listLinked = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listArray.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList add ,  time = "+(end-start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLinked.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("listLinked add,  time = "+(end-start));


        //addLast в конец

         start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listArray.addLast(3);
        }
         end = System.currentTimeMillis();
        System.out.println("ArrayList add last,  time = "+(end-start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLinked.addLast(3);
        }
        end = System.currentTimeMillis();
        System.out.println("listLinked add last,  time = "+(end-start));

        listArray.clear();
        listLinked.clear();

        // addFirst

        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listArray.addLast(3);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList addFirst,  time = "+(end-start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLinked.addLast(3);
        }
        end = System.currentTimeMillis();
        System.out.println("listLinked addFirst,  time = "+(end-start));

        listArray.clear();
        listLinked.clear();


         // removeMiddl удаление из середины

        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            if (listArray.size() > 0){
                listArray.remove(listArray.size() / 2);
        }
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList remove Middle,  time = "+(end-start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            if(listLinked.size()>0) {
                listLinked.remove(listLinked.size() / 2);
            }
        }
        end = System.currentTimeMillis();
        System.out.println("listLinked remove Middle,  time = "+(end-start));


        // removeFirst  удаление сначала

        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            if(listArray.size()>0) {
                listArray.removeFirst();
            }
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList remove Middle,  time = "+(end-start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            if(listLinked.size()>0) {

                listLinked.removeFirst();
            }
        }
        end = System.currentTimeMillis();
        System.out.println("listLinked remove Middle,  time = "+(end-start));


        //  removeLast удаление с конца

        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            if(listArray.size()>0) {
                listArray.removeLast();
            }
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList remove Middle,  time = "+(end-start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            if(listLinked.size()>0) {
                listLinked.removeLast();
            }
        }
        end = System.currentTimeMillis();
        System.out.println("listLinked remove Middle,  time = "+(end-start));


        // removeObject удаляем по значению

//        start = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            listArray.remove(3);
//        }
//        end = System.currentTimeMillis();
//        System.out.println("ArrayList removeObject,  time = "+(end-start));
//
//
//        start = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            listLinked.remove(3);
//        }
//        end = System.currentTimeMillis();
//        System.out.println("ArrayList removeObject,  time = "+(end-start));



        //set замена по индексу set

        start = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            listArray.set(150_000, 7);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList set,  time = "+(end-start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            listArray.set(150_000, 7);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList set ,  time = "+(end-start));



        //  get взять элемент по индексу

        start = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            listArray.get(50_000);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList get,  time = "+(end-start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            listArray.get(50_000);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add Middle,  time = "+(end-start));






    }
}
