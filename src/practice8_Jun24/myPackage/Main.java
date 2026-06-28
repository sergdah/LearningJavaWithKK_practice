package practice8_Jun24.myPackage;

import java.io.*;

public class Main {

    // Метод для записи текста в файл
    public static void writeToFile(String filePath, String text) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("Текст записан в: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }

    // Метод для чтения текста из файла
    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Текст прочитан из: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
        return content.toString();
    }

    // Метод для сериализации ферм
    public static void serializeFarms(String filePath, Farm farm1, Farm farm2) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filePath))) {
            oos.writeObject(farm1);
            oos.writeObject(farm2);
            System.out.println("Фермы сериализованы в: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации: " + e.getMessage());
        }
    }

    // Метод для десериализации ферм
    public static void deserializeFarms(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filePath))) {
            Farm farm1 = (Farm) ois.readObject();
            Farm farm2 = (Farm) ois.readObject();

            System.out.println("\nДесериализованные фермы:");
            System.out.println(farm1);
            System.out.println(farm2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String text = "текст";

        System.out.println("=== 1. ЗАПИСЬ С ОТНОСИТЕЛЬНЫМ ПУТЕМ ===\n");

        // 1. Запись с относительным путем
        String relativePath = "text_file.txt";
        writeToFile(relativePath, text);
        System.out.println();

        System.out.println("=== 2. ЗАПИСЬ С АБСОЛЮТНЫМ ПУТЕМ ===\n");

        // 2. Запись с абсолютным путем
        String absolutePath = "/Users/sergey.dohtarenko/Documents/absolute_text.txt";
        writeToFile(absolutePath, text);
        System.out.println();

        System.out.println("=== 3. ЧТЕНИЕ ИЗ ПЕРВОГО ФАЙЛА ===\n");

        // 3. Чтение из первого файла
        String content1 = readFromFile(relativePath);
        System.out.println("Содержимое: " + content1);
        System.out.println();

        System.out.println("=== 4. ЧТЕНИЕ ИЗ ВТОРОГО ФАЙЛА ===\n");

        // 4. Чтение из второго файла
        String content2 = readFromFile(absolutePath);
        System.out.println("Содержимое: " + content2);
        System.out.println();

        System.out.println("=== 5. СЕРИАЛИЗАЦИЯ ФЕРМ ===\n");

        // 5. Создание ферм
        Farm farm1 = new Farm("Ферма \"Успех\"", 150, 250.5, 2010);
        Farm farm2 = new Farm("Ферма \"Урожай\"", 200, 380.0, 2015);

        System.out.println("Исходные данные:");
        System.out.println(farm1);
        System.out.println(farm2);
        System.out.println();

        // Сериализация
        String farmFilePath = "farms.dat";
        serializeFarms(farmFilePath, farm1, farm2);
        System.out.println();

        System.out.println("=== ДЕСЕРИАЛИЗАЦИЯ ФЕРМ ===\n");

        // Десериализация
        deserializeFarms(farmFilePath);
    }
}
