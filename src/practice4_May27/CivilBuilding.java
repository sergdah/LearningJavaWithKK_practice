package practice4_May27;

/*1.2 Создать класс Гражданские здания (CivilBuilding).
Гражданские здания должны наследоваться от класса Постройка.
Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.
 */

public class CivilBuilding extends Building {
    private String purpose;      // назначение (жилое или общественное)
    private int numberOfFloors;  // количество этажей

    public CivilBuilding(String street, String wallMaterial, int yearOfConstruction,
                         String purpose, int numberOfFloors) {
        super(street, wallMaterial, yearOfConstruction);
        this.purpose = purpose;
        this.numberOfFloors = numberOfFloors;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
}