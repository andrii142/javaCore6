package module4.zoo;

/**
 * Created by citsym on 16.02.17.
 */
public class Zoo {

    public static void main(String[] args) {

//        int[] intArray = new int[5];

        Animal[] animalsArray = new Animal[2];

        animalsArray[0] = new Monkey();
        animalsArray[1] = new Elephant();

        feedAllAnimals(animalsArray);


    }

    public static void feedAllAnimals(Animal[] animalsArray) {
        for (Animal animal : animalsArray) {
            animal.feed();
        }
    }


}
