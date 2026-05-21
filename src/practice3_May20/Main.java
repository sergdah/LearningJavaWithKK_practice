package practice3_May20;

public class Main {
    public static void main(String[] args) {

//        Book[] books = new Book[5];
//        books[0] = new Book(1, "Стихи", "Самуил Маршак", "БЧБ", 1923, 392, 12.99);
//        books[1] = new Book(2, "Преступление и наказание", "Федор Достоевский", "Азбука", 1866, 672, 3.10);
//        books[2] = new Book(3, "Мастер и Маргарита", "Михаил Булгаков", "бурачок", 1967, 480, 20.01);
//        books[3] = new Book(4, "1984", "Джордж Оруэлл", "Враги", 1988, 416, 35.0);
//        books[4] = new Book(5, "Совершенное оружие", "Айзек Азимов", "Капуста запада", 1992, 304, 3.00);
//
//        Book str = books[1] ;

        String str = "I'd like JAVA but no";

        // ЗАДАНИЕ 1: Метод с параметром стринг
        StringMethods.processString(str);

        // ЗАДАНИЕ 2: Вывести последний символ строки
        System.out.println("*** END OF ROW ***");


        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ: '" + lastChar + "'");
        System.out.println();

        // ЗАДАНИЕ 10: Вырезать подстроку "Java"
        System.out.println("*** CUT ROW***");

        int position = str.indexOf("J");

        if (position >= 0) {
            System.out.println("Позиция буквы 'J': " + position);
            System.out.println("Строка до слова 'JAVA'" + str.substring(0, position));
            System.out.println("Строка после слова 'JAVA'" + str.substring(position+3,str.length()));
        } else {
            System.out.println("Слово 'JAVA' не найдено");
        }
    }
}



