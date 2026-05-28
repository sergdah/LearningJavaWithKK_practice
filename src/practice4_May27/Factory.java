package practice4_May27;

/*1.6 Создать класс фабрика.
Поля, которые можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)
Все поля должны быть с модификатором доступа private. Реализовывать методы getter и setter по необходимости.
Инициализацию объекта производить через конструктор.
 */

public class Factory extends IndustrialBuilding {
    private int numberOfWorkers;
    private String product;

    public Factory(String street, String wallMaterial, int yearOfConstruction, String industry, int numberOfWorkers, String product) {
        super(street, wallMaterial, yearOfConstruction, industry);
        this.numberOfWorkers = numberOfWorkers;
        this.product = product;
    }
}