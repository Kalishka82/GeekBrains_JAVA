// Задача 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
package web_01_hometask;

import java.util.Arrays;
import java.util.Random;

public class ex001 {
    public static void main(String[] args) {
        int[] array = new int[11];
        Random random = new Random();

        fillRandArray(array, random);
        System.out.println(Arrays.toString(array));

        int max = findMax(array);
        System.out.println("max = " + max);

        int min = findMin(array);
        System.out.println("min = " + min);
        }

    static void fillRandArray(int[] array, Random random) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}