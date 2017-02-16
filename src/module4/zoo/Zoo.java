package module4.zoo;

import module4.zoo.bird.Own;
import module4.zoo.bird.Parrot;
import module4.zoo.bird.Sparrow;
import module4.zoo.mammal.Elephant;
import module4.zoo.mammal.Human;
import module4.zoo.mammal.Monkey;

import java.util.Arrays;

/**
 * Created by citsym on 16.02.17.
 */
public class Zoo {

    public static void main(String[] args) {

//        int[] intArray = new int[5];

        Animal[] animalsArray = new Animal[2];

        animalsArray[0] = new Monkey("Masha");
        animalsArray[1] = new Elephant();

        animalsArray = addElementToArray(animalsArray, new Own());
        animalsArray = addElementToArray(animalsArray, new Parrot());

        Monkey monkeyNina = new Monkey("Nina");

        animalsArray = addElementToArray(animalsArray, monkeyNina);

        animalsArray = addElementToArray(animalsArray, new Sparrow());

        animalsArray = addElementToArray(animalsArray, new Human());

        feedAllAnimals(animalsArray);

    }

    private static Animal[] addElementToArray(Animal[] animalsArray, Animal newZooMember) {
        Animal[] newAnimals = Arrays.copyOf(animalsArray, animalsArray.length + 1);
        newAnimals[newAnimals.length-1] = newZooMember;
        return newAnimals;
    }

    public static void feedAllAnimals(Animal[] animalsArray) {
        for (Animal animal : animalsArray) {
            animal.feed();
        }
    }


}
