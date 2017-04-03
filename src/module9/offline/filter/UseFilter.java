package module9.offline.filter;

import module3.webinar.Car;
import module4.zoo.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static module4.zoo.Zoo.initZooWithAnimals;

/**
 * Created by citsym on 30.03.17.
 */
public class UseFilter {

    public static void main(String[] args) {

        List<Car> cars = createCars();

//        List<Car> filteredCars = filter(cars,
//
//                car -> {
//                    // filter logic
//                    return car.getYear() == 2015;
//
//                });
//
//
//        System.out.println(filteredCars);
//
//
//        cars = filter(cars, a -> a.getModel().equals("BMW"));


        System.out.println(cars);

        System.out.println("===================TRASH");
        Animal[] animals = initZooWithAnimals();
        System.out.println("===================TRASH");


        List<Animal> listAnimals = Arrays.asList(animals);

        System.out.println(listAnimals);


//        listAnimals = filter(listAnimals, a -> a.getFoodName().equals("banana"));
//
//        System.out.println(listAnimals);


//        listAnimals.stream().filter(a -> a.getFoodName().equals("banana")).forEach((a)->{
//            System.out.println(a);
//        });

        listAnimals = listAnimals.stream().filter(a -> a.getFoodName().equals("banana")).collect(Collectors.toList());

        System.out.println(listAnimals);


        List<Car> filteredCars = createCars();

        filteredCars = filteredCars.stream().filter(a -> a.getYear() > 2010).collect(Collectors.toList());

        System.out.println(filteredCars);


    }
//
//    private static <E> List<E> filter(List<E> items, Filter<E> filter) {
//
//        List<E> filteredItems = new ArrayList<>();
//
//        for (E item : items) {
//            if (filter.apply(item)){
//                filteredItems.add(item);
//            }
//        }
//
//        return filteredItems;
//    }


    private static List<Car> createCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1987, 1000000, "Pavlo"));
        cars.add(new Car("BMW", 2015, 1000000, "Pavlo"));
        cars.add(new Car("BMW", 1990, 1000000, "Pavlo"));
        cars.add(new Car("Lada", 2012, 20000, "Kolya"));
        cars.add(new Car("Lada", 2015, 20000, "Kolya"));
        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
        cars.add(new Car("Nissan", 2010, 200000, "Vasya"));
        return cars;
    }

}
