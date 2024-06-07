package de.telran.lesson10_Iterator;

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {

        System.out.println("== ArrayList ==");
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 8, 5, 6, 3));
        arr.add(10);
        System.out.println(arr);  //== ArrayList ==[1, 2, 3, 8, 5, 6, 3, 10]

        // Работаем с индексом  ArrayList

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 5) { //какое-то условие, если больше 5 - на экран
                System.out.println("arr[" + i + "]=" + arr.get(i)); //arr[3]=8,arr[4]=5,arr[5]=6, arr[7]=10
            }
        }
        //  Array с  ИТЕРАТОР

        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {          // если у нас есть следующий объект
            Integer val = iterator.next();   // c помощью next() получили ссылку на следующий элемент
            if (val >= 5) {                 //какое-то условие
                System.out.println("arr = " + val); //arr = 8,arr = 5,arr = 6, arr = 10
            }
            if (val == 3) {
                iterator.remove();
            }
        }
        System.out.println("Remove" + arr);
        //Array foreach            = новый вид цикла for
        //работаем с форич foreach           // arr (foreach) = 8//arr (foreach) = 5//arr (foreach) = 6//arr (foreach) = 10

        for (Integer val : arr) {
            if (val >= 5) {
                System.out.println("arr (foreach) = " + val);
            }
        }


        //Работаем с linkedList

        System.out.println("== LinkedList ==");
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 8, 5, 6, 3));
        linkedList.add(10);
        System.out.println(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) >= 5) { //какое-то условие
                System.out.println("linkedList[" + i + "]=" + linkedList.get(i));//== LinkedList ==[1, 2, 3, 8, 5, 6, 3, 10]

            }
        }
        // linkedList с iterator

        iterator = linkedList.iterator();// извлекли итератор из линкед лист,чтобы перебрать
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            if (val >= 5) { //какое-то условие
                System.out.println("linkedList = " + val); //выводим каждый элемент используя итератор
                                                           //linkedList[3]=8,linkedList[4]=5,linkedList[5]=6, linkedList[7]=10
            }
            if (val == 3) {
                iterator.remove();
            }
        }
        System.out.println("remove" + linkedList);

        //работаем с форич foreach

        for (Integer val : linkedList) {
            if (val >= 5) {
                System.out.println("linkedList (foreach) = " + val);
            }

        }


        // Работаем с HashSet

        System.out.println("== HashSet ==");
        HashSet<Integer> hashSet = new HashSet<>(List.of(1, 2, 3, 8, 5, 6, 3));
        hashSet.add(10);
        System.out.println(hashSet);
        iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            if (val >= 5) { //какое-то условие
                System.out.println("hashSet =" + val);
            }
            if (val == 3) {
                iterator.remove();
            }

        }
        System.out.println("Remove" + hashSet);

        //работаем с форич foreach

        for (Integer val : hashSet) {
            if (val >= 5) {
                System.out.println("hashSet (foreach) = " + val);
            }
        }
    }
}
