package de.telran.lesson9;

import java.util.Comparator;

public class CatNameCompare implements Comparator<Cat> { //интерфейс Comporator,сравнивает 2 посторонних объекта
    // по измененной логике.

    @Override
    public int compare(Cat o1, Cat o2) { // сравниваем по имени
        if (o1.getName().equals(o2.getName())) {
            return 0;
        } else if (o1.getName().charAt(0) < o2.getName().charAt(0)) {
            return -1;
        } else {
            return 0;
        }
    }

}
