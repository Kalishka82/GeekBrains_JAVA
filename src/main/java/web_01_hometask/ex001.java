// Задача 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
package web_01_hometask;

import java.util.Arrays;
import java.util.Random;

public class ex001 {
    public static void main(String[] args) {
        int[] array = new int[11];
        Random random = new Random();

        FillRandArray(array, random);
        System.out.println(Arrays.toString(array));

        int max = FindMax(array);
        System.out.println("max = " + max);

        int min = FindMin(array);
        System.out.println("min = " + min);
        }

    static int[] FillRandArray (int[] array, Random random) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        return array;
    }

    static int FindMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
//            else max = max;
        }
        return max;
    }

    static int FindMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}