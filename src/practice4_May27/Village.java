package practice4_May27;
/*1. Класс Деревня. Деревня будет состоять из построек.
К постройкам относятся промышленные здания и гражданские.
К промышленным зданиям будут относится заводы и фермы.
К гражданским будут относится: административные здания, жилые здания.
 */
public class Village {
    private String name;
    private Building[] buildings;
    private int buildingCount;

    public Village(String name) {
        this.name = name;
        this.buildings = new Building[100];
        this.buildingCount = 0;
    }

    // Добавить постройку
    public void addBuilding(Building building) {
        if (buildingCount < buildings.length) {
            buildings[buildingCount] = building;
            buildingCount++;
            System.out.println("Постройка добавлена в деревню");
        } else {
            System.out.println("Не осталось места для построек");
        }
    }



    // Getters  Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuildingCount() {
        return buildingCount;
    }
}