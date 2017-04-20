package module10.webinare;

import module9.offline.Car;
import module9.offline.Engine;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.function.Supplier;

/**
 * Created by citsym on 10.04.17.
 */
public class UseResources {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fs = new FileInputStream("resources/ourProperties.properties"); BufferedReader bf = new BufferedReader(new FileReader("resources/ourProperties.properties"))) {

//        int k;
//        char symbol;
//
//        while ((k = fs.read()) != -1) {
//
//            symbol = (char) k;
//
//
//        }

            Properties properties = new Properties();
            properties.load(fs);

            System.out.println(properties.getProperty("userName", "default"));


           bf.lines().forEach(System.out::println);


            Engine engine = new Engine();
            engine.setValue(4);

//            Supplier<module3.webinar.Car> var = ()->  createCars().get(0);



//            printAllTheItems(()->createCars());
            printAllTheItems(UseResources::createCars);

            doCompare(new Car(), new Car(engine), (o1, o2) -> (int) (o1.getEngine().getValue() - o2.getEngine().getValue()));

//            String readLine = "";
//            while (readLine != null) {
//                readLine = bf.readLine();
//                System.out.println(readLine);
//
//            }

//        fs.close();
        }

//        try (BufferedReader bf = new BufferedReader(new FileReader("resources/ourProperties.properties"))) {
//

//
//
//        }


    }

    private static void printAllTheItems(Supplier<List<?>> items) {
        List<?> objects = items.get();

        for (Object object : objects) {
            System.out.println(object);
        }
    }

    private static void doCompare(Car car, Car car1, Comparator<Car> comparator) {
        comparator.compare(car, car1);
    }


    private static List<module3.webinar.Car> createCars() {
        ArrayList<module3.webinar.Car> cars = new ArrayList<>();
        cars.add(new module3.webinar.Car("BMW", 1987, 1000000, "Pavlo"));
        cars.add(new module3.webinar.Car("BMW", 2015, 1000000, "Pavlo"));
        cars.add(new module3.webinar.Car("BMW", 1990, 1000000, "Pavlo"));
        cars.add(new module3.webinar.Car("Lada", 2012, 20000, "Kolya"));
        cars.add(new module3.webinar.Car("Lada", 2015, 20000, "Kolya"));
        cars.add(new module3.webinar.Car("Nissan", 2000, 200000, "Vasya"));
        cars.add(new module3.webinar.Car("Nissan", 2010, 200000, "Vasya"));
        return cars;
    }

}
