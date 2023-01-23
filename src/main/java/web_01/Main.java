package web_01;
// ex1(). Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"

// ex2()/ex2_1(). Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное кол-во
// подряд идущих 1.

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
//    main - сниппет
    public static void main(String[] args) {
//        ex1();
//        ex2();
        ex2_1();
    }


    private static void ex1() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = Scan.nextLine();
//        sout - сниппет для помощи
        System.out.printf("Привет, %s!%n", name);
        Scan.close();
    }

    private static void ex2() {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int max = 0;
        int count = 0;
        for (int item : arr) {
            if (item == 1) {
                count++;
            }
            else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }

    private static void ex2_1() {
        int[] binaryArray = new int[1000];
        int counter = 0;
        int maxLength = 0;
        Random random = new Random();
//        double randomFromMath = Math.random();
//        System.out.println(randomFromMath);
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(0, 2);
        }
//        System.out.println(Arrays.toString(binaryArray));

        for (int num: binaryArray) {
            if (num == 1) {
                counter++;
            }
            else {
                /* if (counter > maxLength) {
                    maxLength = counter;
                    counter = 0;
                } */
                //(условие) ? true: false;
//                maxLength = (counter > maxLength) ? counter: maxLength;
                maxLength = Math.max(counter, maxLength);
                counter = 0;
            }
        }
        System.out.println("max length: " + Math.max(counter, maxLength));
    }
}
