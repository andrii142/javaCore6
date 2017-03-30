package module7.offline;

import module3.webinar.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by citsym on 09.03.17.
 */
public class UseCollections {

    public static void main(String[] args) {

//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add(new String("Some"));
//        linkedList.add("Some");
//        linkedList.add("Some1");
//        linkedList.add("Some");
//
//        linkedList.set(1, null);
//
//        List arrayList = new ArrayList(linkedList);
//
//        linkedList.set(0, "Other");
//
//
//        for (Object o : arrayList) {
//            if (o!=null) {
//                System.out.println(o.getClass());
//            }
//        }


        ArrayList<Car> cars = createCars();

        System.out.println(cars);

        Car[] myArrStr = cars.toArray(new Car[0]);

        System.out.println(Arrays.toString(myArrStr));


//        Car carToRemove = null;

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car element = iterator.next();
            if (element.getModel().equals("BMW") && element.getYear() == 1987) {
                iterator.remove();
            }
        }

//        cars.remove(carToRemove);

        cars.remove(new Car("BMW", 1987, 200000, "Pavlo"));

        System.out.println(cars);


    }

    private static ArrayList<Car> createCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1987, 200000, "Pavlo"));
        cars.add(new Car("BMW", 1987, 200000, "Pavlo"));
        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
//        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
//        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
//        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
//        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
        return cars;
    }
}
