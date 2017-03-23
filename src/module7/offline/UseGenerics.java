package module7.offline;

import module3.webinar.Car;
import module7.offline.shapes.Circle;
import module7.offline.shapes.Shape;
import module7.offline.shapes.Square;

import java.util.Arrays;

/**
 * Created by citsym on 23.03.17.
 */
public class UseGenerics {
    public static void main(String[] args) {

        Car[] arrayCar = new Car[0];


        arrayCar = addElementToArray(arrayCar, new Car("BMW", 1987));
        arrayCar = addElementToArray(arrayCar, new Car("Opel", 2010));
        arrayCar = addElementToArray(arrayCar, new Car("Mers", 2000));
        arrayCar = addElementToArray(arrayCar, new Car("Lada", 1980));


        for (Car car : arrayCar) {
            System.out.println(car.getModel() + " " + car.getYear());
        }


        Shape[] shapes = new Shape[0];

        shapes = addElementToArray(shapes, new Square(3d));
        shapes = addElementToArray(shapes, new Circle(3));

    }

    private static <T> T[] addElementToArray(T[] animalsArray, T newZooMember) {
        T[] newAnimals = Arrays.copyOf(animalsArray, animalsArray.length + 1);
        newAnimals[newAnimals.length-1] = newZooMember;
        return newAnimals;
    }


}
