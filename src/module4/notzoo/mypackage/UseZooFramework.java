package module4.notzoo.mypackage;

import module4.zoo.Animal;
import module4.zoo.Zoo;

/**
 * Created by citsym on 16.02.17.
 */
public class UseZooFramework {

    public static void main(String[] args) {

        Animal[] myAnimals = new Animal[1];

        myAnimals[0] = new Snake();

        Zoo.feedAllAnimals(myAnimals);

    }
}
