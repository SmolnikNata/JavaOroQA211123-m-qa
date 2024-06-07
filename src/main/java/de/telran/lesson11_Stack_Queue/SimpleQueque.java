package de.telran.lesson11_Stack_Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueque {
    public static void main(String[] args) {

        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Вaся");
        queue1.add("Петя");
        queue1.add("Оля");
        queue1.add("Даша");
        queue1.add("Света");
        queue1.add("Катя");

        //ДОБАВКА

        System.out.println("Добавка через add- " + queue1.add("Илья"));// Добавка через add true[Вся, Петя, Оля, Даша, Света, Катя, Илья]
        System.out.println(queue1);
        System.out.println("Добавка через offer -" + queue1.offer("Миша")); //Добавка через offer true              [Вся, Петя, Оля, Даша, Света, Катя, Илья, Миша]
        System.out.println(queue1);

        //ПРОСМОТР

        System.out.println("Просмотр peek -" + queue1.peek()); // Извлечение peek Вся
        System.out.println("Просмотр element -" + queue1.element()); // Извлечение peek Вся
        System.out.println(queue1);

        // ИЗВЛЕЧЕНИЕ

        System.out.println("Извлечение pool - " + queue1.poll()); // Извлечение pool - Вся
        System.out.println("Извлечение remove - " + queue1.remove()); //Извлечение remove - Петя
        System.out.println(queue1);                               // [Оля, Даша, Света, Катя, Илья, Миша]

        Queue<String> queue2 = new LinkedList<>();
        System.out.println(queue2);
        System.out.println("Просмотр element -" + queue2.element()); // из пустого списка нельзя посмотреть эл-т.Эксэпшн
        System.out.println("Извлечение remove -" + queue2.remove()); // из пустого списка нельзя удалить эл-т Эксэпшн

        System.out.println("Просмотр peek -" + queue2.peek());  // вернкт null
        System.out.println("Извлечение pool - " + queue2.poll()); // вернкт null

    }

}

