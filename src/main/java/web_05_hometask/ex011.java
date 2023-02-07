/*
Задача 11. Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
 */
package web_05_hometask;

import java.util.*;

public class ex011 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Svetlana Petrova",
                "Kristina Belova", "Anna Musina", "Alla Krutova"));
        names.add("Petr Lykov"); //вариант добавления имен в сущ-ий список

        ArrayList<String> spetrova = new ArrayList<>(Arrays.asList("+7 (799) 404-91-52",
                                                                "+7 (204) 668-01-74"));
        ArrayList<String> kbelova = new ArrayList<>(Arrays.asList("+7 (892) 397-44-89"));
        ArrayList<String> amusina = new ArrayList<>(Arrays.asList("7 (425) 819-14-98",
                                                                "7 (288) 474-98-66"));
        amusina.add("+7 (749) 982-37-06");  // при необходимости можно добавить/удалить
        ArrayList<String> akrutova = new ArrayList<>(Arrays.asList("+7 (167) 673-40-65"));
        ArrayList<String> plykov = new ArrayList<>(Arrays.asList("+7 (674) 631-52-66"));

        ArrayList<ArrayList> phones = new ArrayList<>(Arrays.asList(spetrova, kbelova,
                amusina, akrutova, plykov));

        Map<String, List<String>> phbook = new LinkedHashMap<>();
        for (int i = 0; i < names.size(); i++) {
            phbook.put(names.get(i), phones.get(i));
        }
        System.out.println(phbook);
    }
}