package ru.foxit.grayfox;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        lesson1(); // 1 Задание
        lesson2(); // 2 Задания
        lesson2_2(); // Хардкод 2 задания
        lesson3(); // 3 Задание
        lesson4(); // 4 Задание
        lesson5(new int[5]); // 5 Задание
        lesson6(new int[5]); // 6 Задание
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson1() {
        // psvm
        // sout
        // ctrl + alt + l
        //1. TODO Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] foxs = new int[10];
        foxs[0] = 1;
        foxs[1] = 1;
        foxs[2] = 0;
        foxs[3] = 0;
        foxs[4] = 1;
        foxs[5] = 0;
        foxs[6] = 1;
        foxs[7] = 1;
        foxs[8] = 0;
        foxs[9] = 0;

        for (int num = 0; num < foxs.length; num++) {
            foxs[num] = (foxs[num] > 0) ? 0 : 1;
        }

        System.out.println(Arrays.deepToString(new int[][]{foxs}));

    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson2() {
        // psvm
        // sout
        // ctrl + alt + l
        // Стандарт решения
        // 2. TODO Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] foxs = new int[8];
//      foxs[0] = 0;
//      foxs[1] = 3;
//      foxs[2] = 6;
//      foxs[3] = 9;
//      foxs[4] = 12;
//      foxs[5] = 15;
//      foxs[6] = 18;
//      foxs[7] = 21;
        for (int num = 0; num < foxs.length; num++) {
            foxs[num] = num * 3;
        }
        System.out.println(Arrays.deepToString(new int[][]{foxs}));
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson2_2() {
        // Хардкод или костыль, называйте как хотите =) Вариант все равно работает!
        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] foxs = new int[9];

        for (int i = 0; i <= 24; i += 3) {
            foxs[i / 3] = i;
        }
        System.out.println(Arrays.deepToString(new int[][]{foxs}));
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson3() {
        // java.lang.ArrayIndexOutOfBoundsException - Выход за пределы массива - исключение.
        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] foxs = new int[12];
        foxs[0] = 1;
        foxs[1] = 5;
        foxs[2] = 3;
        foxs[3] = 2;
        foxs[4] = 11;
        foxs[5] = 4;
        foxs[6] = 5;
        foxs[7] = 2;
        foxs[8] = 4;
        foxs[9] = 8;
        foxs[10] = 9;
        foxs[11] = 1;

        int ex;
        for (int num = 0; num < foxs.length; num++) {
            ex = foxs[num];
            foxs[num] = ex < 6 ? ex * 2 : ex;
        }
        System.out.println(Arrays.deepToString(new int[][]{foxs}));

    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson4() {
        // TODO 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        // TODO 1 0 0 0 1
        // TODO 0 1 0 1 0
        // TODO 0 0 1 0 0
        // TODO 0 1 0 1 0
        // TODO 1 0 0 0 1

        // TODO 1 0 0 0 0 0 0 0 0 1
        // TODO 0 1 0 0 0 0 0 0 1 0
        // TODO 0 0 1 0 0 0 0 1 0 0
        // TODO 0 0 0 1 0 0 1 0 0 0
        // TODO 0 0 0 0 1 1 0 0 0 0
        // TODO 0 0 0 0 1 1 0 0 0 0
        // TODO 0 0 0 1 0 0 1 0 0 0
        // TODO 0 0 1 0 0 0 0 1 0 0
        // TODO 0 1 0 0 0 0 0 0 1 0
        // TODO 1 0 0 0 0 0 0 0 0 1

        lesson4_2(5);
        System.out.println();
        lesson4_2(10);

    }

    public static int[][] lesson4_2(int len) {
        int[][] ints = new int[len][len];
        int length = ints.length;

        for (int i = 0; i < length; i++) {
            ints[i][i] = 1;
            ints[i][length - i - 1] = 1;
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
        // end

        return ints;
    }

    ////////////////////////////////////////////////////////////////////
    public static int[] lesson5(int[] ints) {
        // TODO 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int length = ints.length;
        int min = 0;
        int max = 0;

        for (int num : ints) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println(Arrays.deepToString(new int[][]{ints}));
//        for (int num = 0; num < length ; num++) {
//                System.out.print(ints[num] +" ");
//            System.out.println();
//        }

        return new int[]{min, max};
    }

    ////////////////////////////////////////////////////////////////////
    public static boolean lesson6(int[] array) {
        //TODO 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.

        int[] foxs = new int[10];
        int length = foxs.length;

        int cheskA = 0;
        int cheskB = 0;
        foxs[0] = 2;
        foxs[1] = 1;
        foxs[2] = 0;
        foxs[3] = 0;
        foxs[4] = 1;
        foxs[5] = 0;
        foxs[6] = 1;
        foxs[7] = 1;
        foxs[8] = 0;

        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j <= i; j++) {
                cheskA += foxs[j];
            }

            for (int k = i + 1; k < length; k++) {
                cheskB += foxs[k];
                if (cheskA == cheskB) return true;
            }
        }
        System.out.println(Arrays.deepToString(new int[][]{foxs}));
        return false;
    }

}


