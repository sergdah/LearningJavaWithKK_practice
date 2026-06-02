package practice4_May27;

/*1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от Постройки.
Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано
(машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)
 */

public class IndustrialBuilding extends Building {
    private String industry;  // отрасль (машиностроение, легкая промышленность и т.д.)

    public IndustrialBuilding(String street, String wallMaterial, int yearOfConstruction,
                              String industry) {
        super(street, wallMaterial, yearOfConstruction);
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }
}