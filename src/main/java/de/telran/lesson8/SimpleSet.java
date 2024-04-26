package de.telran.lesson8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SimpleSet {
    public static void main(String[] args) {

        //TreeSet - отсортированый вид
        Set<Integer> setTree = new TreeSet<>(); // отсортированный вид на выходе.
        setTree.add(5);
        setTree.add(1);
        setTree.add(8);
        setTree.add(4);
        setTree.add(20); // [1, 4, 5, 8, 20]
        setTree.add(8);  //false

        System.out.println(setTree); // массив на выходе отсортировывается
        System.out.println(setTree.add(8));

        //LinkedHashSet - сохраняестя история добавления
        Set<Integer> setLinked = new LinkedHashSet<>();// привязан к времени добавления
        setLinked.add(5);
        setLinked.add(1);
        setLinked.add(8);
        setLinked.add(4);
        setLinked.add(20); //[5, 1, 8, 4, 20]
        setLinked.add(8); //false

        System.out.println(setLinked); // массив на выходе не отсортировывается. по времени добавления
        System.out.println(setLinked.add(8));

        //HashSet
        Set<Integer> setHash = new HashSet<>();// получать быстрый доступ к операциям с данными. По коду
        setHash.add(5);
        setHash.add(1);
        setHash.add(8);
        setHash.add(4);
        setHash.add(20); //[1, 4, 20, 5, 8]
        setHash.add(8);  //false
        System.out.println("setHash -> " + setHash);
        System.out.println("setHash -> " + setHash.add(8));



        Set<Human> setHashHumans = new HashSet<>();

        Human h1 = new Human("Вася",25);
        System.out.println("Hash = "+h1.hashCode());
        System.out.println("Index = "+h1.hashCode()%16);
        setHashHumans.add(h1);

        Human h2 = new Human("Вася",24);
        System.out.println("Hash = "+h2.hashCode());
        System.out.println("Index = "+h2.hashCode()%16);
        setHashHumans.add(h2);

        setHashHumans.add(new Human("Вася",27));
        System.out.println(setHashHumans);



    }
}
