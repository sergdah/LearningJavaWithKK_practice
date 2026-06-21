package practice5_Jun3;

public class WashingMachine implements ElectroDevices {
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public WashingMachine(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
System.out.println(name + " -  стирает");
    }
}
