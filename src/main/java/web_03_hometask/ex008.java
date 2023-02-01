/*
Задача 8.1
- Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
- Вывести название каждой планеты и количество его повторений в списке.
Задача 8.2 (если выполнено первое задание)
- Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */
package web_03_hometask;

import java.util.*;

public class ex008 {
    public static void main(String[] args) {
        List<String> solarSystem = new ArrayList<>();
        Random random = new Random();
        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};

        for (int i = 0; i < 20; i++) {
            solarSystem.add(solarSystemPlanets[random.nextInt(0, solarSystemPlanets.length)]);
        }
        System.out.println(solarSystem);

        for (String planet : solarSystemPlanets) {
            System.out.printf(planet + "-" + Collections.frequency(solarSystem, planet) + "\n");
        }

        Set<String> set = new HashSet<>(solarSystem);
        System.out.println(set);
    }
}
