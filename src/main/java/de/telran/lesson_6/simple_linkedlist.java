package de.telran.lesson_6;

import java.util.LinkedList;
import java.util.List;

public class simple_linkedlist {
    //создаем LinkedList
    public static void main(String[] args) {
        List<Integer>list = new LinkedList<>();
        // добавление в хвост(в конец)
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.addLast(7);
        System.out.println(list);

        // вставить эл в конец
        list.add(2,10);
        System.out.println(list);

        //вставка вначало и в конец
        list.addFirst(11);
        list.add(0,0); //старая версия jdk
        System.out.println(list);
        list.addLast(3);
        System.out.println(list);

        //удаление с головы по индексу
        list.remove(0);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);

        //удаление с хвоста
        list.removeLast();
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);

        //изменение информации
        System.out.println(list.set(1, 33));

        // удаление из середины по индексу
        list.remove(2);
        System.out.println(list);
        // по значению
        list.remove(Integer.valueOf(8)); //только для интедж.  list.remove("Мама")
        System.out.println(list);

        //извлечение информациииьиз списка
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());




        //метод контейнсЖ найти!
        System.out.println(list.contains(5));
        System.out.println(list.contains(10));
        if(list.contains(5)){
            System.out.println("Число найдено");
        }
        else {
            System.out.println("Число не найдено");

        }
        //очистка списка
        list.clear();
        System.out.println("Лист чист" + list);

    }
}
