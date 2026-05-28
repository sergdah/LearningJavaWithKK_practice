package practice4_May27;
/*1.1 Создать класс Постройка (Building).
Поля у класса Постройка: улица, материал стен, год постройки.*/

public class Building {
    private String street;
    private String wallMaterial;
    private int yearBuilt;

    public Building(String street, String wallMaterial, int yearBuilt) {
        this.street = street;
        this.wallMaterial = wallMaterial;
        this.yearBuilt = yearBuilt;
    }

    public Building() {
    }

    // Getters и Setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
}