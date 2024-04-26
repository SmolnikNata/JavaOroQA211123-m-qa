package de.telran.lesson8;

public class SimpeEquals {
    public static void main(String[] args) {
        Human h1 = new Human("Вася",25);
        Human h2 = h1;
        Human h3 = new Human("Вася",25);
        Human h4 = new Human("Вася",26);



        System.out.println(h1.equals(h2)); //сравниваем h1 b h2 //true

        Integer i1=5; // о = 5, this(h1)= Human
        System.out.println(h1.equals(i1));//false// разные типы даннах getClass  от this h1 вернет HUMAN
        System.out.println(h1.equals(h3));//

        System.out.println("h1.hashCode = " + h1.hashCode());
        System.out.println("h1.hashCode = " + h2.hashCode());
        System.out.println("h1.hashCode = " + h3.hashCode());
        System.out.println("h1.hashCode = " + h4.hashCode());
    }
}
