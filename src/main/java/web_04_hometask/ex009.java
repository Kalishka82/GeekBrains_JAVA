/*
Задача 9. Реализовать консольное приложение, которое:
 * принимает от пользователя и “запоминает” строки.
 * Если введено print, выводит строки так, чтобы последняя введенная была
 первой в списке, а первая - последней.
 * Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
package web_04_hometask;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
public class ex009 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (true) {
            String text = inputText();
            if (text.equalsIgnoreCase("print")) {
                for (String s : queue) {
                    System.out.println(s);
                }
            } else if (text.equalsIgnoreCase("revert")) {
                queue.removeFirst();
            } else if (text.equalsIgnoreCase("exit")) {
                break;
            } else {
                queue.addFirst(text);
            }
        }
    }

    private static String inputText() {
        String text = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст для сохранения в памяти (print - для вывода из памяти,\n" +
                "revert - для удаления предыдущей введенной строки, exit - для выхода из программы): ");
        try {
            text = scan.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}
