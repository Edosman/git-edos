/**
 * Java. Level 1. Lesson 2. Homework
 *
 * @author Eduard Krasikov
 * @version Aug 16, 2018
 */

import java.util.Arrays;

public class HomeWork_2 {
    public static void main(String[] args) {
        invertArray();
        invertArray_v2();
        fillArray();
        chengeArrayMin_6();
        find_min_max_cell();
        chengeDiagonalCell_1();
        System.out.println(findBalanceArray(new int[]{2, 6, 1, 3, 4, 0}));
    }

    // The Task №1
    public static void invertArray() {
        int array[] = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // The Task №1 version2
    public static void invertArray_v2() {
        int array[] = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1:
                    array[i] = 0;
                    break;
                case 0:
                    array[i] = 1;
                    break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // The Task №2
    public static void fillArray() {
        int array[] = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3) {
            array[i] = array[0] + j;
        }
        System.out.println(Arrays.toString(array));
    }

    // The Task №3
    public static void chengeArrayMin_6() {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // The Task №4
    public static void chengeDiagonalCell_1() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
                if (i == j || i + j == 3) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    // The Task №5*
    public static void find_min_max_cell() {
        int arr[] = {-8, 8, 12, 1, 56, -5, 100, -10};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива - " + max);
        System.out.println("Минимальный элемент массива - " + min);
    }

    // The Task №6**
    public static boolean findBalanceArray(int[] array) {
        int sum = 0;
        int sum_2 = 0;
        boolean a = false;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        for (int i = 0; i < array.length; i++) {
            sum_2 = sum_2 + array[i];
            if (sum_2 == sum / 2) {
                a = true;
                break;
            }
        }
        return a;
    }
}


