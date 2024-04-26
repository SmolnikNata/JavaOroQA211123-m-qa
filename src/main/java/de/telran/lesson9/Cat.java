package de.telran.lesson9;

import java.util.Objects;
// ссылка на лекцию: https://docs.google.com/presentation/d/17LZ-fRkYM6hwNTamQP1QueMeoJ0SObLR/edit?usp=sharing&ouid=105463127504141233206&rtpof=true&sd=true

public class Cat implements Comparable<Cat> { //сравнивает себя с другим.внутри класса
    private String name;
    private int age;
    private int weight;


    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Cat o) { //под капотом сравнивает и сортирует/
        if (this.age > o.age) {
            return 1;
        }
        if (this.age < o.age) {
            return -1;
        }
        // this.age == this.age)
        return 0;
    }
}