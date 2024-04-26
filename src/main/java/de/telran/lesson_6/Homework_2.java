package de.telran.lesson_6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Homework_2 {
    public static void main(String[] args) {

        List<String> listStr = new LinkedList<>();

        listStr.add("Сегодня");
        listStr.add("утром");
        listStr.add("была");
        listStr.add("хорошая");
        listStr.add("погода");
        System.out.println(listStr);

        ///Перебрать LinkedList и найти первое вхождение определенной строки.
        System.out.println("Индекс вхождения " + findFirstOccurence(listStr,"была"));
        System.out.println(getLongString(listStr));

        ///Перебрать LinkedList и удалить все элементы, содержащие определенную подстроку.
        withoutSubstring(listStr,"хорошая");
        System.out.println("Без слова 'хорошая' :" + listStr);


        List<Integer> listInt = new LinkedList<>();

        listInt.add(2);
        listInt.add(3);
        listInt.add(1);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        listInt.add(12);
        listInt.add(27);
        System.out.println(averegeValue(listInt));
        System.out.println(maxElem(listInt));

        //Перебрать LinkedList и вычислить произведение всех элементов.
        System.out.println("Произведение: " + productOfNumbers(listInt));

        //Перебрать LinkedList и заменить все элементы, кратные 3, на нули.
       changeAnO(listInt);
        System.out.println("Линкед лист после замены кратных 3-м чисел на 0: " + listInt);

        List<String> listStrN = new LinkedList<>();
        listStrN.add("Сегодня");
        listStrN.add("утром");
        listStrN.add("была");
        listStrN.add("хорошая");
        listStrN.add("погода");
        System.out.println(listStr);
//        for (int i = 0; i <listStrN.size() ; i++) {
//            listStrN.set(i,replaceVowels(listStrN.get(i)));
//
//        }
//        for (String str:listStrN) {
//            System.out.println(str);
//
//        }


    }

    //Перебрать LinkedList и найти самую длинную строку.

    public static String getLongString(List<String> listS) {
        String longStr = listS.getFirst();      // самая длинная строка, пусть первая
        for (int i = 0; i < listS.size(); i++) {
            String currentLine = listS.get(i);  // строка,которую извлекаем
            if (currentLine.length() > longStr.length()) {
                longStr = currentLine;
            }
        }
        return longStr;
    }

    //Найти среднее значение элементов LinkedList.

    public static int averegeValue(List<Integer> listNum) {
        int sum = 0;
        int averege = sum/listNum.size();

        for (int i = 0; i < listNum.size(); i++) {
            sum+= listNum.get(i);
            averege = sum/listNum.size();
        }
        return averege;
    }
    // Перебрать LinkedList и найти наибольший элемент.

    public static int maxElem(List<Integer>listMax){
        int max = listMax.getFirst();
        for(int i = 0; i < listMax.size(); i++) {
            int elem = listMax.get(i);
            if(elem>max){
                max = elem;
            }
        }
        return max;
    }

    //Перебрать LinkedList и найти первое вхождение определенной строки.

    public static int findFirstOccurence(List<String>listStr, String searchWort){
        for (int i = 0; i < listStr.size(); i++) {
            if(listStr.get(i).equals(searchWort)){
                return i;
            }
        }
        return -1;
    }
    //Перебрать LinkedList и заменить все элементы, кратные 3, на нули.

    public static void changeAnO(List<Integer>intList){
        for (int i = 1; i <intList.size() ; i++) {
            if(intList.get(i)%3 ==0){
              intList.set(i,0);
            }
        }
    }

    //Перебрать LinkedList и удалить все элементы, содержащие определенную подстроку.
    public static void withoutSubstring(List<String>listStr, String sub){
        for (int i = 0; i < listStr.size(); i++) {
            if(listStr.get(i).contains(sub)){
                listStr.remove(i);
            }

        }
    }
    //Перебрать LinkedList и вычислить произведение всех элементов.
    public static int productOfNumbers(List<Integer>intList){
        int prod = 1;
        for (int i = 0; i <intList.size() ; i++) {
            prod *= intList.get(i);
        }
        return prod;
    }
    //Перебрать LinkedList и заменить все гласные буквы в каждой строке на символ '*'.
//    public static String replaceVowels(String str) {
//        StringBuilder stringBuilder = new StringBuilder(str);
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            char ch = stringBuilder.charAt(i);
//            if (isVowel(ch)) {
//                stringBuilder.setCharAt(i, '*');
//            }
//        }
//        return stringBuilder.toString();
  //  }

}
