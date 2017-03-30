package module8.questions;


import module3.webinar.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Created by citsym on 27.03.17.
 */
public class UseGenerics {

    //        extends Comparable<? super T>


    public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list) {

        T withMaxValue = null;

        Collections.sort(list);

        withMaxValue = list.get(list.size()-1);

        return withMaxValue;
    }

    public static void main(String[] args) {

        List<Car> cars = createCars();

        Car max = max(cars);

        System.out.println(max);

        List<String> names = new ArrayList<>();

        names.add("Pdjsdfo");
        names.add("jsdf");
        names.add("wqdq");
        names.add("sdfjwi");
        names.add("Adsfjlm");

        System.out.println(max(names));


        String max1 = Collections.max(names);
        System.out.println(max1);
//        putIn(5);

    }




    private static List<Car> createCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1987, 1000000, "Pavlo"));
        cars.add(new Car("Lada", 2012, 20000, "Kolya"));
        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
        return cars;
    }

}
