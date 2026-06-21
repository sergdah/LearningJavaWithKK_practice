package practice5_Jun3;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffee1 = new CoffeeMachine("DeLonghi", "functions1", 500.0, false);
        CoffeeMachine coffee2 = new CoffeeMachine("Philips", "functions2", 150.0, false);

        Refrigerator fridge1 = new Refrigerator("NoFrost", "Bosch", 800.0, true);
        Refrigerator fridge2 = new Refrigerator("SmartCool", "Samsung", 1200.0, true);

        WashingMachine washer1 = new WashingMachine("Канди", "Electrolux", 450.0, false);
        WashingMachine washer2 = new WashingMachine("Пузырик", "LG", 600.0, true);

        VacuumCleaner vacuum1 = new VacuumCleaner("МегаОтсос", "Dyson", 700.0, false);
        VacuumCleaner vacuum2 = new VacuumCleaner("Суперсак", "Philips", 200.0, true);

        //ВЫСТАВКА 1: Все электроприборы
        System.out.println("____________________________");
        System.out.println("ВЫСТАВКА ВСЕХ ЭЛЕКТРОПРИБОРОВ");
        ElectroDevices[] allDevices = {coffee1, coffee2, fridge1, fridge2, washer1, washer2, vacuum1, vacuum2};
        for (ElectroDevices electroDevices : allDevices) {
            electroDevices.work();
        }

        System.out.println("____________________________");
        System.out.println("ВЫСТАВКА ВСЕХ ПРИБОРОВ из кухни");
        KitchenDevices[] allKitchenDevices = {coffee1, coffee2, fridge1, fridge2};
        for (KitchenDevices kitchenDevices : allKitchenDevices) {
            kitchenDevices.cook();
        }

        System.out.println("____________________________");
        System.out.println("ONLY COFFEEMAKERS");
        CoffeeMachine[] onlyCoffeMakers = {coffee1,coffee2};
        for (CoffeeMachine coffeeMachine: onlyCoffeMakers)
            coffeeMachine.cook();
        }
    }
