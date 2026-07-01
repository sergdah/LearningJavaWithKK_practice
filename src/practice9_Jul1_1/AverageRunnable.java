package practice9_Jul1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class AverageRunnable implements Runnable {
    private int threadNumber;

    public AverageRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        int count = 5;

        // Генерируем 5 случайных чисел и добавляем в коллекцию
        System.out.print("Поток " + threadNumber + ": числа = ");
        for (int i = 0; i < count; i++) {
            int number = random.nextInt(100) + 1;
            numbers.add(number);
            System.out.print(number + " ");
        }

        // Вычисляем среднее арифметическое
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / count;
        System.out.println("| среднее = " + average);
    }
}
