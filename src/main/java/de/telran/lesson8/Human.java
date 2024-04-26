package de.telran.lesson8;

import java.util.Objects;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) { //конструктор для создания объекта-
        // инициализирующий конструктор в который мы будем передавать параметры
        // и будем создавать объект с заполнеными параметрами
        this.name = name;
        this.age = age;
    }
    public Human(){   //конструктор по умолчанию, так как он будет удален после создания конструктора
    }

    public String getName() { //методы, которые дают доступ к приватным данным
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() { //для печати в красивом виде
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) { //  генерация хэш кода
        if (this == o) return true;  // сравнивает, что ссылка на один и тот же объект if( h1=h2);o=h2;this=h1
        if (o == null || getClass() != o.getClass()) return false;// одного ли типа объекты,

        Human human = (Human) o; //создали переменную Human и преобразовали обджект к классу Human

        return age == human.age && Objects.equals(name, human.name); //сравниваем содержимое..тру
    }

    @Override
    public int hashCode() {  //
        return Objects.hash(name, age);
    }
}
