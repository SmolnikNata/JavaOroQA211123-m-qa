package de.telran.lesson11_Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleDequeue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        System.out.println("===");
        // LIFO
        deque.push("Вся");   //addFirst
        deque.push("Петя");
        deque.push("Оля");
        deque.push("Даша");
        deque.push("Света");
        deque.push("Катя");
        // Добавка
        System.out.println("Первый на выход -" + deque.peek());
        System.out.println(deque);

        System.out.println("Извлечение элемента-" + deque.pop()); // removeFirst
        System.out.println(deque);

        deque.clear();
        System.out.println("===");

        //FIFO
        deque.offer("Вся");
        deque.offer("Петя");
        deque.offer("Оля");
        deque.offer("Даша");
        deque.offer("Света");
        deque.offer("Катя");

        System.out.println(deque);

        System.out.println("Первый на выход -" + deque.peek());
        System.out.println(deque);

        System.out.println("Извлекаем элемент -" + deque.pop());
        System.out.println(deque);



        // Альтернативный подход
        deque.clear();
        System.out.println("===LIFO===");
        deque.offer("Вся");
        deque.offer("Петя");
        deque.offer("Оля");
        deque.offer("Даша");
        deque.offer("Света");
        deque.offer("Катя");





    }
}
