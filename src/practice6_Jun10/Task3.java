package practice6_Jun10;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return title + " - " + author;
        }

        // 3.2 Переопределяем equals - всегда возвращает false
        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }

    public static void main(String[] args) {
        // Создаем
        List<Book> books = new ArrayList<>(List.of(
                new Book("Война и мир", "Толстой"),
                new Book("Преступление и наказание", "Достоевский"),
                new Book("Мастер и Маргарита", "Булгаков")
        ));

        System.out.println("Исходный список книг");
        for (Book book : books) {
            System.out.println("• " + book);
        }

        // Удаляем
        Book toRemove = new Book("Война и мир", "Толстой");
        System.out.println("\nПопытаемся удалить: " + toRemove);

        boolean removed = books.remove(toRemove);
        System.out.println("Была ли удалена книга: " + removed);

        System.out.println("\nСписок после удаления");
        for (Book book : books) {
            System.out.println("• " + book);
        }
    }
}