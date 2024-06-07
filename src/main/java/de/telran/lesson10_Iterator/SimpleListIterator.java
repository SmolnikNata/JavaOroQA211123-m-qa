package de.telran.lesson10_Iterator;

import java.util.*;

public class SimpleListIterator {
    public static void main(String[] args) {

        System.out.println("== ArrayList ==");
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 8, 5, 6, 3));
        arr.add(10);
        System.out.println(arr);

        ListIterator<Integer> listIterator = arr.listIterator();
        while (listIterator.hasNext()) {
            Integer val = listIterator.next();
            if (val >= 5) {
                System.out.println("arr (next) = " + val);
            }
        }
        while (listIterator.hasPrevious()) {
            Integer val = listIterator.previous();
            if (val >= 5) { //какое-то условие
                System.out.println("arr (previous) = " + val);
            }
            if (val == 3) {
                listIterator.remove();
            }
            if (val == 2) {
                listIterator.add(-1);
            }
        }
        System.out.println(arr); // удаляет и втавляет

        ///


        System.out.println("== LinkedList ==");
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 8, 5, 6, 3));
        linkedList.add(10);
        System.out.println(linkedList);

        listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            Integer val = listIterator.next();
            if (val >= 5) { //какое-то условие
                System.out.println("linkedList (next) = " + val);
            }
            if (val == 3) {
                listIterator.remove();
            }

        }
        System.out.println(linkedList);

        while (listIterator.hasPrevious()) {
            Integer val = listIterator.previous();
            if (val >= 5) { //какое-то условие
                System.out.println("linkedList (previous) = " + val);
            }
            if (val == 2) {
                listIterator.add(-1);
            }
        }
        System.out.println(linkedList);


        System.out.println("== HashSet ==");
        HashSet<Integer> hashSet = new HashSet<>(List.of(1, 2, 3, 8, 5, 6, 3));
        hashSet.add(10);
        System.out.println(hashSet);


        // listIterator = hashSet.listIterator(); // в хэщсэт отсутствует лист итератор

        //Пример будем позднее изучать
         hashSet.forEach(val-> System.out.println("hashSet.Объект из лямбды"));// императивный стиль программирования
//        hashSet.forEach(val -> {
//            if (val >= 5) {
//                System.out.println("hashSet.Объект из лямбды");
//            }
//        }

    }
}
