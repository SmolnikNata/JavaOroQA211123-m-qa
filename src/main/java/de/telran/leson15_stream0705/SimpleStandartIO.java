package de.telran.leson15_stream0705;

import java.io.*;
import java.util.Scanner;

public class SimpleStandartIO {
    public static void main(String[] args) throws IOException {
        String str = "Slon";
        int valueInt = 10;
        double valueDouble = 21.5;

        System.out.print(str);
        System.out.print(valueInt);
        System.out.print(valueDouble);

        System.out.println();

        System.out.println(str);
        System.err.println(valueInt);
        System.out.println(valueDouble);
        System.out.println("Слон по имени" +  str+ ",возрастом 10 лет имеет вес" + valueDouble + "тонны");
        //затратно,много участков памяти выделяется
        //Для того,чтобы собирать длинные строки есть StringBuilder, StringBufer
        // Применяем принт Ф
        System.out.println();
        System.out.printf("Слон по имени %s,возрастом %d лет имеет вес %.2f тонны%n",str,valueInt,valueDouble);
        System.out.println("Конец работы");
        // ввод инфы
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите число");
        int inScan = scanner.nextInt();
        System.out.println("Вы ввели - " + inScan);

        // Aльтернатива через InputStream
        //InputStream
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.print("Введите строку: ");
        String inStr = bufferedReader.readLine();
        System.out.println("Вы ввели строку - "+inStr);
    }
}
