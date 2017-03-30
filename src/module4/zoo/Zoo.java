package module4.zoo;

import module4.zoo.bird.Owl;
import module4.zoo.bird.Parrot;
import module4.zoo.bird.Sparrow;
import module4.zoo.mammal.Elephant;
import module4.zoo.mammal.Human;
import module4.zoo.mammal.Monkey;

import java.util.Arrays;

/**
 * Created by citsym on 16.02.17.
 */
public final class Zoo {

    private static Zoo INSTANCE;
    private String name;

    private Zoo(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Zoo getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Zoo("Las Vegas");
        }
        return INSTANCE;
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

    public static   Animal[] initZooWithAnimals(){
        Animal[] animalsArray = new Animal[2];

        Monkey monkeyMasha = new Monkey("Masha", "Brown");
        animalsArray[0] = monkeyMasha;

        System.out.println("In mokey cage " + Monkey.countAllMonkeysInCage());
        monkeyMasha.setFoodCount(5);

        System.out.println(monkeyMasha.getName() + " has : " + monkeyMasha.getFoodCount() + monkeyMasha.getFoodName());

        monkeyMasha.increaseFoodCount();

        System.out.println(monkeyMasha.getName() + " has : " + monkeyMasha.getFoodCount() + monkeyMasha.getFoodName());

        System.out.println("Total food monkeys has" + Monkey.getFoodCountTotal());


        animalsArray[1] = new Elephant();

        animalsArray = addElementToArray(animalsArray, new Owl());
        animalsArray = addElementToArray(animalsArray, new Parrot());

        Monkey monkeyNina = new Monkey("Nina", "Orange");

        System.out.println("In mokey cage " + Monkey.countAllMonkeysInCage());

        monkeyNina.setFoodCount(10);

        System.out.println(monkeyNina.getName() + " has : " + monkeyNina.getFoodCount() + monkeyNina.getFoodName());

        monkeyNina.increaseFoodCount();

        System.out.println(monkeyNina.getName() + " has : " + monkeyNina.getFoodCount() + monkeyNina.getFoodName());

        System.out.println("Total food monkeys has" + Monkey.getFoodCountTotal());


        animalsArray = addElementToArray(animalsArray, monkeyNina);

        animalsArray = addElementToArray(animalsArray, new Sparrow());

        animalsArray = addElementToArray(animalsArray, new Human());

        return animalsArray;
    }


}
