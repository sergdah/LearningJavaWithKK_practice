package practice4_May27;

/*1.5 Создать класс Многоквартирный жилой дом.
Поля, которые можно определить в Многоквартирном жилье: количество квартир.
 */
public class AppartmentHouse extends CivilBuilding {
    private int numberOfApartments;  // количество квартир

    public AppartmentHouse(String street, String wallMaterial, int yearOfConstruction, int numberOfFloors, int numberOfApartments) {
        super(street, wallMaterial, yearOfConstruction, "жилое", numberOfFloors);
        this.numberOfApartments = numberOfApartments;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }
}