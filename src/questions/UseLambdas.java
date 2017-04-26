package questions;

import module3.webinar.Car;
import module9.offline.Cylinder;
import module9.offline.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

/**
 * Created by citsym on 03.04.17.
 */
public class UseLambdas {




    public static void main(String[] args) {


        int variable = Integer.valueOf(args[0]);

        List<Car> cars = createCars();


//        cars.sort(Comparator.comparing(Car::getModel).reversed().thenComparing(car -> car.getYear()).reversed());
//        cars.sort((t1, t2) -> {
//            if (t1.getModel().equals(t2.getModel())) {
//                return t2.getYear() - t1.getYear();
//            }
//            return t1.getModel().compareTo(t2.getModel());
//        });


//        cars.sort(Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));
//
//        System.out.println(cars);


        cars.stream().filter(car -> car.getModel().equals("BMW")).mapToInt(Car::getPrice)
                .average().ifPresent(avg -> System.out.println("OUR avg : " + avg));


        module9.offline.Car car = new module9.offline.Car(new Engine());


        Engine engine = car.getEngine();

        if (engine !=null){
            Cylinder[] cylinders = engine.getCylinders();

            if (cylinders !=null){
                Cylinder cylinder = cylinders[0];
                if (cylinder!=null){
                    System.out.println(" Material of cylinders is " + cylinder.getMaterial());
                }
            }
        }

        Function<Cylinder[], Cylinder> cylinderFunction = cylinders -> cylinders[variable];

        methodOperate(cylinderFunction, car.getEngine().getCylinders());

        Optional.of(car)
                .map(module9.offline.Car::getEngine)
                .map(Engine::getCylinders)
                .map(cylinderFunction)
                .map(Cylinder::getMaterial)
                .ifPresent(System.out::println);


        List<String> listStringsModels = cars.stream().map(Car::getModel).collect(toList());
        System.out.println("Count of cars models " + listStringsModels.stream().distinct().count());

        System.out.println("OUR MODELS : " + listStringsModels.stream().distinct().skip(2).collect(Collectors.joining("; ")));

        Map<String, Integer> collect = listStringsModels.stream().collect(toMap(Function.identity(), String::length, (t1, t2) -> t1 ));



        System.out.println(collect);

        System.out.println("Sum of letters " + collect.values().stream().collect(summarizingInt(t -> t)).toString());


//        TreeSet<String> collect = cars.stream().map(Car::getModel).collect(Collectors.toCollection(TreeSet::new));
//        collect.stream().forEach(System.out::println);
    }

    private static void methodOperate(Function<Cylinder[], Cylinder> cylinderFunction, Cylinder[] cylinders) {
        cylinderFunction.apply(cylinders);
    }


    private static List<Car> createCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 2012, 20000, "Kolya"));
        cars.add(new Car("Lada", 2015, 20000, "Kolya"));
        cars.add(new Car("BMW", 1990, 1000500, "Pavlo"));
        cars.add(new Car("Renault", 2015, 100000, "Pavlo"));
        cars.add(new Car("BMW", 1987, 1000000, "Pavlo"));
        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
        cars.add(new Car("Opel", 2010, 200000, "Vasya"));
        return cars;
    }
}
