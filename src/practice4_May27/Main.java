package practice4_May27;
/*
2.1  Создать спортсооружение
2.2 Получить значение количества людей, которые могут находится в спортсооружении, созданном выше и вывести это в консоль (метод getter)
2.3 Изменить количество людей, которые могут находится в спортсооружении и вывести их в консоль после изменения (методы setter и getter)
*/
public class Main {
    public static void main(String[] args) {


        AdministrativeBuilding sportFacility = new AdministrativeBuilding(
                "Стрит",
                "гуаноэндстикс",
                1972,
                "общественное",
                4,
                "СК Атлет",
                200
        );
        System.out.println("Sport buildig with capacity " + sportFacility.getCapacity());
        sportFacility.setCapacity(300);
        System.out.println("Sport buildig with new capacity " + sportFacility.getCapacity());


    }
}