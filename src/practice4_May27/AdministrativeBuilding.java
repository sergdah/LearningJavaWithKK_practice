package practice4_May27;

public class AdministrativeBuilding extends CivilBuilding {
    private String administrativePurpose;  // офисное, кинотеатр, спортсооружение
    private int capacity;                   // количество человек

    public AdministrativeBuilding(String street, String wallMaterial, int yearOfConstruction,
                                  String purpose, int numberOfFloors,
                                  String administrativePurpose, int capacity) {
        super(street, wallMaterial, yearOfConstruction, purpose, numberOfFloors);
        this.administrativePurpose = administrativePurpose;
        this.capacity = capacity;
    }

    public String getAdministrativePurpose() {
        return administrativePurpose;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}