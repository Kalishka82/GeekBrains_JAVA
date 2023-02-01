/*
Задача 10. Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
 */
package web_04_hometask;

import java.util.*;

public class ex010 {
    public static void main(String[] args) {
        Deque<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(reverseList(list));
    }

    private static LinkedList<Integer> reverseList (Deque<Integer> listDeque) {
        LinkedList<Integer> listRev = new LinkedList<>();

        while (listDeque.size() > 0) {
            listRev.add(listDeque.getLast());
            listDeque.removeLast();
        }
        return listRev;
    }
}
