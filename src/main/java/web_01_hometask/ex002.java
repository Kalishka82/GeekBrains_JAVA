/* Задача 2. Написать метод, который определяет, является ли год високосным, и возвращает
boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
package web_01_hometask;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите год для определения високосности: ");
        int year = scan.nextInt();
        scan.close();

        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
