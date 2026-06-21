package practice5_Jun3;

public class CoffeeMachine implements ElectroDevices, KitchenDevices{
    private String name;
    private String functions;
    private double price;
    private Boolean isOn;

    // Конструктор
    public CoffeeMachine(String name, String functions, double price, Boolean isOn) {
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;
    }

    // Переопределение метода work
    @Override
    public void work() {
        System.out.println(name + ": Кофемашина варит кофе");
    }

    @Override
    public void start() {
        this.isOn = true;
        System.out.println(name + " стартует и теперь включена (isOn = " + this.isOn + ")");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " ВЫКЛЮЧЕНА (isOn = " + this.isOn + ")");
    }

    @Override
    public void cook() {
        System.out.println("COOKS COFFEE");
    }
}
