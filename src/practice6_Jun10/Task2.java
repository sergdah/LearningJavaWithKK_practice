package practice6_Jun10;


import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("Молоко");
        shoppingList.add("Хлеб");
        shoppingList.add("Яйца");
        shoppingList.add("Масло");
        shoppingList.add("Сыр");

        for (String product : shoppingList) {
            System.out.println(product);
        }

        shoppingList.remove("Хлеб");

        for (String product : shoppingList) {
            System.out.println(product);
        }

        System.out.println("Осталось купить: " + shoppingList.size());
    }
}