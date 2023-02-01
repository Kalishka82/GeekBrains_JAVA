/*
Задача 7. Задан целочисленный список ArrayList. Найти минимальное,
максимальное и среднее арифметическое из этого списка.
 */
package web_03_hometask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Collections.*;

public class ex007 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(-100, 100));
        }
        System.out.println(list);
        System.out.printf("min = %d \nmax = %d \naverage = %.2f \n"
                , min(list), max(list), average(list));
        }

    private static double average(List<Integer> list) {
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum/list.size();
    }
}
