package practice9_Jul3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Auto> cars = new ArrayList<>();

        cars.add(new Auto(1, "Toyota", 50000, 2020, 180, 1500000));
        cars.add(new Auto(2, "BMW", 30000, 2021, 220, 3000000));
        cars.add(new Auto(3, "Mercedes", 80000, 2018, 230, 3500000));
        cars.add(new Auto(4, "Audi", 45000, 2019, 210, 2800000));
        cars.add(new Auto(5, "Volkswagen", 60000, 2017, 190, 1800000));

        for (Auto car : cars) {
            System.out.println(car);
        }
        System.out.println("Машины с пробегом от 50000 до 100000 км:");
        List<Auto> autoFilter = cars.stream().filter((car)-> {
                    return (car.getMileage() >= 50000 && car.getMileage() <= 100000);
                }).toList();
//        List<Auto> autosFilter =  autos.stream().filter((auto) -> {
//            return (auto.getProbeg() > 50000 && auto.getProbeg() < 100000);
//        }).toList();
    }
}
