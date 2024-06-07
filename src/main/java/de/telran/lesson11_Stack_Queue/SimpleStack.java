package de.telran.lesson11_Stack_Queue;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {

        //методы  работы

        Stack<Integer> stack1 = new Stack(); //всегда нужно строго типизировать
        stack1.push(6);
        stack1.push(1);
        stack1.push(8);
        stack1.push(5);
        stack1.push(3);
        stack1.push(9);

        //посмотреть

        System.out.println(stack1);      //[6, 1, 8, 5, 3, 9]
        System.out.println("Добфвляем push - " + stack1.push(9));  //Первый на выход, посмотреть - 9

        // извлекать

        System.out.println("Извлекаем элемент - " + stack1.pop());
        System.out.println(stack1);

        // для просмотра

        System.out.println("Первый на выход - " + stack1.peek());
        System.out.println(stack1);

        // добфвить элемент

        System.out.println("добавить через add - " + stack1.add(0));  //редко
        System.out.println(stack1);

        // проверка есть ли

        System.out.println("Есть ли элемент " + stack1.search(8));
    }
}
