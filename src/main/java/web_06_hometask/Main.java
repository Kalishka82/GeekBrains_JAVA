/*
1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.
2. Создать множество ноутбуков (ArrayList).
3. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
Выводить только те ноутбуки, что соответствуют условию
 */
package web_06_hometask;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addNotebook(new Notebooks("Irbis", "NB257", "серый"
                        , 14.0, "IPS", "Intel Celeron 3350"
                        , 1.1, 2, 4, "Intel HD Graphics 500"
                        , 64, "Windows 10 Home Single Language", 15_999))
                .addNotebook(new Notebooks("DEXP", "Aquilon", "серебристый"
                , 15.6, "IPS", "Intel Celeron 4020"
                , 1.1, 2, 8, "Intel UHD Graphics 600"
                , 128, "Windows 11 Home", 20_499))
                .addNotebook(new Notebooks("Acer", "Aspire 3 A315-34-C1QD"
                        , "черный", 15.6, "TN+film"
                        , "Intel Celeron 4000", 1.1, 2, 4
                        , "Intel UHD Graphics 600", 128
                        , "без ОС", 26_999))
                .addNotebook(new Notebooks("Lenovo", "IdeaPad 3 15ALC6"
                        , "серый", 15.6, "TN+film"
                        , "AMD Ryzen 3 5300U", 2.6, 4, 4
                        , "AMD Radeon Graphics", 1000
                        , "без ОС", 31_999))
                .addNotebook(new Notebooks("ASUS", "VivoBook 14 K413EP-EK368"
                        , "черный", 14.0, "TN+film"
                        , "Intel Core i5-1135G7", 2.4, 4, 8
                        , "GeForce MX330 2 ГБ", 256
                        , "Windows 11 Home", 51_999))
                .addNotebook(new Notebooks("MSI", "Katana GF76 11SC-853XRU"
                        , "черный", 17.3, "OLED"
                        , "Intel Core i5-11400H", 2.7, 6, 16
                        , "GeForce GTX 1650 4 ГБ", 512
                        , "без ОС", 50_399))
                .addNotebook(new Notebooks("Apple", "MacBook Air"
                        , "золотистый", 13.6, "IPS"
                        , "Apple M2", 4.0, 4, 8
                        , "Apple M2 8-core", 256
                        , "macOS", 101_199));
        store.printNotes();

        store.findNoteByDiagonal(15.6);
        System.out.println();
        store.findNoteByColor("серый");
        System.out.println();
        store.findNoteByRam(8);
        System.out.println();
        store.findNoteByPrice(20000, 30000);
    }
}
