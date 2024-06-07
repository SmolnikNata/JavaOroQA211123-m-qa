package de.telran.lesson12_map;

import java.util.*;

public class Simple_map {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>();
        System.out.println(map1.put(2,"Наша 2")); //добавление
        System.out.println(map1.put(1,"Наша 1"));
        System.out.println(map1);
        System.out.println(map1.put(1,"Наша новая 1")); // изменение данных
        System.out.println(map1);
        System.out.println(map1.put(3,null));
        System.out.println(map1.put(3,"наша 3"));
        System.out.println(map1);
        System.out.println(map1.put(5,null));
        System.out.println(map1.put(5,"наша 5"));
        System.out.println(map1);
        map1.put(3,"Наша 3");
        System.out.println(map1);//{1=Наша новая 1, 2=Наша 2, 3=Наша 3, 5=наша 5}

        //Изменение  сортировки по ключу
        Map<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());
        System.out.println(map2.put(2,"Наша 2"));
        System.out.println(map2.put(1,"Наша 1"));
        System.out.println(map2.put(5,"Наша 5"));
        map2.put(3,"Наша 3");
        System.out.println(map2);// {5=Наша 5, 3=Наша 3, 2=Наша 2, 1=Наша 1}

        //Просматриваем пару ключ-значение
        for (Map.Entry<Integer, String> el:map2.entrySet()){
            System.out.println(el.getKey() + "=" + el.getValue());
//            5=Наша 5
//            3=Наша 3
//            2=Наша 2
//            1=Наша 1
        }
        System.out.println("ключи");
        for (Integer key: map2.keySet()){
            System.out.println(key);
        }

        System.out.println("значения");
        for (String val: map2.values()){
            System.out.println(val);
        }

        //Поиск элементов
        System.out.println("Поиск");
        System.out.println("1 -> " + map2.get(1)); // 1 -> Наша 1 / нашлось
        System.out.println("4 -> " + map2.get(4));// 4 -> null / не нашлось
        System.out.println(map2.get(1)); //есть ли объект с ключом 1

        //  Поиск . содержит ли
        System.out.println("Поиск Contains");
        System.out.println(" Поиск по ключу 1 :" + map2.containsKey(1));
        System.out.println(" Поиск по ключу 4 :" + map2.containsKey(4));

        System.out.println(" Поиск по ключу 1 :" + map2.containsValue("Наша 1"));
        System.out.println(" Поиск по ключу 4 :" + map2.containsValue("Наша 4"));

        //удаление объекта
        System.out.println("удаление");
        System.out.println("1 -> " + map2.remove(1)); //удаление  1 -> Наша 1 / удаленный элемент
        System.out.println("4 -> " + map2.remove(4));// 4 -> null / удалили,чего не было

        //Удаление по ключу и значению
        System.out.println("Удаление по ключу и значению");
        System.out.println("4 -> " + map2.remove(3, "Другой"));//  false ключ и значение не совпали
        System.out.println("4 -> " + map2.remove(3, "Наша 3")); // true лкюч и значение совпали
        System.out.println(map2);

        // Померять размер
        System.out.println("Size= " + map2.size() + " , isEmpty() =" + map2.isEmpty()); //Size= 2 , isEmpty() =false

        // HashMap порядок хранения объектов не гарантируется
        Map<Integer, String> map3 = new HashMap<>();
        System.out.println(map3.put(2,"Наша 2")); //добавление
        System.out.println(map3.put(1,"Наша 1"));
        // null

        System.out.println(map3.put(5,null)); // изменение данных
        map3.put(3, "Наша 2");
        System.out.println("HashMap = " + map3); //HashMap = {1=Наша 1, 2=Наша 2, 3=Наша 2, 5=null}
        map3.put(17, "Наша 17");
        System.out.println("HashMap = " + map3); //HashMap = {1=Наша 1, 17=Наша 17, 2=Наша 2, 3=Наша 2, 5=null}
        map3.put(null, "Наш 0");
        System.out.println("HashMap = " + map3); //хэш код null будет null  в HashMap

        // LinkedHashMap по истории добавления порядок хранения
        map3 = new LinkedHashMap<>();
        System.out.println(map3.put(2,"Наша 2")); //добавление
        System.out.println(map3.put(1,"Наша 1"));
        // null
 System.out.println(map3.put(5,null)); // изменение данных
        map3.put(3, "Наша 2");
        System.out.println("HashMap = " + map3); //HashMap = {1=Наша 1, 2=Наша 2, 3=Наша 2, 5=null}
        map3.put(17, "Наша 17");
        System.out.println("HashMap = " + map3); //HashMap = {1=Наша 1, 17=Наша 17, 2=Наша 2, 3=Наша 2, 5=null}
        map3.put(null, "Наш 0");
        System.out.println("HashMap = " + map3); //хэш код null будет null  в HashMap
//        HashMap = {2=Наша 2, 1=Наша 1, 5=null, 3=Наша 2}
//        HashMap = {2=Наша 2, 1=Наша 1, 5=null, 3=Наша 2, 17=Наша 17}
//        HashMap = {2=Наша 2, 1=Наша 1, 5=null, 3=Наша 2, 17=Наша 17, null=Наш 0}

    }
}
