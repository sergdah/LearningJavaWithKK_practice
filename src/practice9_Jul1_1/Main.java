package practice9_Jul1_1;

public class Main {

    public static void main(String[] args) {
//        // Создаём и запускаем 5 потоков
//        for (int i = 1; i <= 5; i++) {
//            AverageThread thread = new AverageThread(i);
//            thread.start();
//        }

        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new AverageRunnable(i));
            thread.start();
        }
    }
}
