package de.telran.lesson_5;

import java.util.Arrays;

public class SimpleMultiArray {
    public static void main(String[] args) {
       // двуьерный массив
        int [][]arrInt;
        arrInt = new int[2][3];
        System.out.println(Arrays.toString(arrInt));// [[I@e9e54c2, [I@65ab7765] ссылки на массивы в консоле
        System.out.println(Arrays.deepToString(arrInt));
        arrInt[0][1]=5;
        arrInt[1][2] = 10;
        System.out.println(Arrays.deepToString(arrInt)); //
        int result = arrInt[0][1];
        System.out.println(result);

        int [][] arrIntLit = {{1,2,3,4}, {1,3,4,8}};
        System.out.println(Arrays.deepToString(arrIntLit));  //[[1, 2, 3, 4], [1, 3, 4, 8]]

        int[] arr = arrIntLit[0];
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4]

        int[][][] arrInt3D = {{{1,2}, {6,7}},{{3,4},{5,6}}};
        System.out.println(Arrays.deepToString(arrInt3D));
        arrInt3D[0][1][1] = 10;// изменение
        arrInt3D[1][1][0] = 22;// изменение
        System.out.println(Arrays.deepToString(arrInt3D)); //[[[1, 2], [6, 7]], [[3, 4], [5, 6]]]
                                                           //[[[1, 2], [6, 10]], [[3, 4], [22, 6]]]

        System.out.println(arrInt3D[0][1][0]);// получения




    }
}
