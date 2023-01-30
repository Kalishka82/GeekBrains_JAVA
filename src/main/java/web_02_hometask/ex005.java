/*
Задача 5. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
package web_02_hometask;

import java.io.*;

public class ex005 {
    public static void main(String[] args) {
        String str = new String("TEST");

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/src/main/resources/lib/file_ex005.txt");
        writeToFile(pathFile, strBuild1(str));
//        System.out.println(StrBuild_2(str));
    }

    private static String strBuild1(String string) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            newStr.append(string);
        }
        return newStr.toString();
    }

//    следующий метод указан в кач-ве альтернативы предыдущему,
//    чтобы показать, что и так, и так можно, и оба работают
    private static String strBuild2(String string) {
        String newStr2;
        newStr2 = String.valueOf(string).repeat(100);
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
