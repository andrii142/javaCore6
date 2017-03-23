package module7.questions;

import module4.zoo.Animal;
import module4.zoo.Zoo;

/**
 * Created by citsym on 13.03.17.
 */
public class UseSingleton {

    public static void main(String[] args) {

        Zoo lasVegasZoo = Zoo.getInstance();

        System.out.println(lasVegasZoo.getName());

        Animal[] animals = lasVegasZoo.initZooWithAnimals();


        Zoo.feedAllAnimals(animals);


        Zoo moskowZoo = Zoo.getInstance();
        System.out.println(moskowZoo.getName());

    }


}
