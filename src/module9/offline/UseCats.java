package module9.offline;

import java.util.Random;

/**
 * Created by citsym on 30.03.17.
 */
public class UseCats {

    static int caountOfCats = 4;


    public static void main(String[] args) {

        Car carVasya = new Car();

        carVasya.setName("BMW");

        carVasya.startACar(3);

        carVasya.setName("Opel");

        carVasya.startACar(2);

        carVasya.fire(

                key -> {
                    Random random = new Random();

                    int x = random.nextInt();
                    System.out.println(x);
                    System.out.println(x + caountOfCats);
                    System.out.println(x + key);
                },

                6
        );

//
//        Car.Engine otherEngine = carVasya.new Engine(3);
//
//        carVasya.fire(otherEngine);


        carVasya.drive();


    }
}
