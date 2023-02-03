/*
Задача 5. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
package web_02_hometask;

import java.io.*;

public class ex005 {
    public static void main(String[] args) {
        String str = new String("TEST");
        Integer n = 100;   //кол-во повторений строки str

        System.out.println(str.length());

        String pathProject = System.getProperty("user.dir");
        String PATHFILE = pathProject.concat("/src/main/resources/lib/file_ex005.txt");
        writeToFile(PATHFILE, strBuild1(str, n));
//        System.out.println(strBuild2(str, n));
    }

    private static String strBuild1(String string, Integer n) {
        StringBuilder newStr = new StringBuilder(n * string.length());
        System.out.println(newStr.capacity());
        for (int i = 0; i < n; i++) {
            newStr.append(string);
        }
        return newStr.toString();
    }

//    следующий метод указан в кач-ве альтернативы предыдущему,
//    чтобы показать, что и так, и так можно, и оба работают
    private static String strBuild2(String string, Integer n) {
        String newStr2;
        newStr2 = string.repeat(n);
        return newStr2;
    }

    private static void writeToFile(String path, String string) {
        try(PrintWriter pw = new PrintWriter(path)) {
            pw.print(string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
