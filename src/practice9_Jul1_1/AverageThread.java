package practice9_Jul1_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class AverageThread extends Thread {

    private int threadNumber;

    public AverageThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        int count = 5;

        // Генерируем 5 случайных чисел и добавляем в коллекцию
        System.out.println("Поток " + threadNumber + " c числами ");
        for (int i = 0; i < count; i++) {
            int number = random.nextInt(100) + 1;
            numbers.add(number);
            System.out.print(number + " ");
            System.out.println();
        }

        // Вычисляем среднее арифметическое
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / count;
        System.out.println("Поток " + threadNumber+" среднее = " + average);
    }
}