/*
Задача 4. Напишите метод, который принимает на вход строку (String) и определяет
является ли строка палиндромом (возвращает boolean значение).
 */
package web_02_hometask;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любую строку: ");
        String str = scan.next();
        scan.close();

        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String string) {
        String reverse = new StringBuilder(string).reverse().toString();
        int compare = reverse.compareToIgnoreCase(string);
        return (compare == 0);
    }
}
