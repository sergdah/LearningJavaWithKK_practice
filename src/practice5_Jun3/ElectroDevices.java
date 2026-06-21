package practice5_Jun3;

public interface ElectroDevices {
    // Абстрактный метод
    void work();

    default void start() {
        System.out.println("Электроприбор стартует");
    }
}
