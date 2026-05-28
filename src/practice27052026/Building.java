package practice27052026;

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