package practice8_Jun24.myPackage;

import java.io.Serializable;

public class Farm implements Serializable {
    private String farmName;
    private int cowCount;
    private double area;
    private int foundedYear;

    // Конструктор по умолчанию
    public Farm() {
    }

    // Конструктор с параметрами
    public Farm(String farmName, int cowCount, double area, int foundedYear) {
        this.farmName = farmName;
        this.cowCount = cowCount;
        this.area = area;
        this.foundedYear = foundedYear;
    }

    // Геттеры и сеттеры
    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public int getCowCount() {
        return cowCount;
    }

    public void setCowCount(int cowCount) {
        this.cowCount = cowCount;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    @Override
    public String toString() {
        return "Ферма: " + farmName +
                " | Коров: " + cowCount +
                " | Площадь: " + area + " га" +
                " | Основана: " + foundedYear;
    }
}

