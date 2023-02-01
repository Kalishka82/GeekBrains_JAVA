/*
Задача 6. Пусть дан произвольный список целых чисел, удалить из него
четные числа (в языке уже есть что-то готовое для этого)
 */
package web_03_hometask;

import java.util.*;

public class ex006 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0, 100));
        }
        System.out.println(list);
        list.removeIf(n -> (n % 2 == 0));
        System.out.println(list);
    }
}
