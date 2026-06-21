package practice6_Jun10;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Привет");
        words.add("Как дела");
        words.add("Праздник");
        words.add("Суфле");

        for (String word : words) {
            System.out.println(word);
        }

        boolean containsCandy = words.contains("Конфета");
        System.out.println("Содержит 'Конфета': " + containsCandy);
        System.out.println("Количество элементов: " + words.size());
    }
}