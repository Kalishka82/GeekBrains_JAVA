/*
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
 */
package web_05_hometask;

import java.util.*;

public class ex012 {
    public static void main(String[] args) {
        String[] employees = {"Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"};

        List<String> names = new ArrayList<>();
        for (int i = 0; i < employees.length; i++) {
            names.add(employees[i].split(" ")[0]);
        }
        Set<String> setnames = new HashSet<>(names);

        System.out.println(countNames(names, setnames).descendingMap());
    }

    private static TreeMap<Integer, List<String>> countNames
            (List<String> names, Set<String> setnames) {
        TreeMap<Integer, List<String>> counts = new TreeMap<>();
        for (String sn : setnames) {
            Integer count = Collections.frequency(names, sn);
            if (counts.containsKey(count)) {
                counts.get(count).add(sn);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(sn);
                counts.put(count, list);
            }
        }
        return counts;
    }
}
