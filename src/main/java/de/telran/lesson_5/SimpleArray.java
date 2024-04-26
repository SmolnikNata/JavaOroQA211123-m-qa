package de.telran.lesson_5;

import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int[]arrInt;//  dв стеке выделяется память
        arrInt = new int[10]; //в куче был создан массив
        System.out.println(Arrays.toString(arrInt));
        arrInt[0] = 5;  // присвоение значений
        arrInt[5] =10;  //
        System.out.println(Arrays.toString(arrInt));
        int[] arrIntLiteral = {1,2,6,4,8};
        System.out.println(Arrays.toString(arrIntLiteral));

        int res = arrIntLiteral[3]; // получаем данные из массива
        System.out.println("arrIntLiteral[3] = " + res);

        //  //копирование одномерного масива
        int[] arrIntLiteralCopy = arrIntLiteral;
        arrIntLiteralCopy[2] = 11;
        System.out.println(Arrays.toString(arrIntLiteralCopy)); //[1, 2, 11, 4, 8] ; [1, 2, 11, 4, 8]
        System.out.println(Arrays.toString(arrIntLiteral));

        int[]arrIntLiteralClone = arrIntLiteral.clone();
        arrIntLiteralClone[2] = 33;
        System.out.println(Arrays.toString(arrIntLiteralClone)); //[1, 2, 11, 4, 8]
                                                                 //[1, 2, 33, 4, 8]






    }
}
