package de.telran.lesson11_Stack_Queue;

import java.util.*;

public class SimplePriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("Вaся");
        queue1.add("Петя");
        queue1.add("Гриша");
        queue1.add("Дуняша");

        System.out.println("ADD -" + queue1.add("Светлана")); // отсортровалось по алфавиту чз comparable
        System.out.println(queue1);

        // add - remove - element

        System.out.println("Просмотр кто первый - "+queue1.element());
        while(!queue1.isEmpty()) {
            System.out.print(queue1.remove()+",");
        }
        System.out.println();   //  [Вaся, Дуняша, Гриша, Петя, Светлана]

        queue1 = new PriorityQueue<>(Comparator.reverseOrder()); // меняет текущую сортировку на обратную
        queue1.add("Вaся");
        queue1.add("Петя");
        queue1.add("Гриша");
//      System.out.println("add.out.println("Add -" + queue1.add("Светлана")); // отсортровалось по алфавиту чз comparable
//        System.out.println(queue1);

        System.out.println(" Кто первый - " + queue1.element()); // Просмотр кто первый - ВсяВся,Гриша,Дуняша,Петя,Светлана,
        System.out.println(queue1);

        System.out.println("Просмотр кто первый - "+queue1.element());
        while(!queue1.isEmpty()) {
            System.out.print(queue1.remove()+",");
        }
        System.out.println();  //[Светлана, Петя, Гриша, Вся, Дуняша]

        // OFFER

         queue1 = new PriorityQueue<>(Comparator.naturalOrder());
        queue1.offer("Вaся");
        queue1.offer("Петя");
        queue1.offer("Гриша");
        queue1.offer("Дуняша");

        System.out.println(queue1);
        System.out.println("Кто первый - " + queue1.peek());

        Iterator<String>iterator = queue1.iterator();
        while (iterator.hasNext()){
            System.out.print("Печатаем элементы " + iterator.hasNext() + ",");
        }
        System.out.println();
        System.out.println(queue1);

        System.out.println("Iterator");
         iterator = queue1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+",");
        }
        System.out.println();
        System.out.println(queue1);
        System.out.println("Извлекаем - poll");
        while(!queue1.isEmpty()) {
            System.out.print(queue1.poll()+",");
        }
        System.out.println();



    }
}
