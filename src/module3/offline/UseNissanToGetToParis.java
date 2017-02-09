package module3.offline;

import java.util.Arrays;

/**
 * Created by citsym on 09.02.17.
 */
public class UseNissanToGetToParis {

    public static void main(String[] args) {

        NissanJukeCar myCar = null;

        System.out.println(myCar);

        myCar = new NissanJukeCar("red");

        System.out.println("DOORS: " + myCar.doorsAmount);

        System.out.println("Color: " + myCar.color);

//        for (Wheal wheel : myCar.wheels) {
//            System.out.println(wheel);
//        }


        System.out.println("Color: " + myCar.color);

        NissanJukeCar familyCar = new NissanJukeCar("yellow");

        System.out.println("Famyly car color: " + familyCar.color);


        boolean areWeInParis = myCar.goToDestination("Paris");

        System.out.println("Are we in Paris? " + (areWeInParis? "YES!": "NO(("));



        boolean areWeInParis2 = familyCar.goToDestination("Paris");

        System.out.println("Are we in Paris? " + (areWeInParis2? "YES!": "NO(("));


        for (int i = 0; i < myCar.wheels.length; i++) {
            myCar.wheels[i] = new Wheal(i);
        }

        System.out.println(Arrays.toString(myCar.wheels));

        boolean areWeInParis3 = myCar.goToDestination("Paris");

        System.out.println("Are we in Paris? " + (areWeInParis3? "YES!": "NO(("));

        myCar.goToDestination("Madrid", 1000, new String[]{"Vasya", "Petya"});





    }
}
