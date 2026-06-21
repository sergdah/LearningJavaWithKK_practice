package practice5_Jun3;

public class Refrigerator implements ElectroDevices, KitchenDevices {
    private String name;
    private String marka;
    private double price;
    private boolean isOn;

    public Refrigerator(String name, String marka, double price, boolean isOn) {
        this.name = name;
        this.marka = marka;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
System.out.println(name + " - производит холод");
    }

    @Override
    public void start() {
        ElectroDevices.super.start();
    }


    @Override
    public void cook() {
        System.out.println("Гатуэ маржо");
    }
}
