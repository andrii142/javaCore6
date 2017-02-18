package module4.questions;

import module4.zoo.Animal;

import java.util.Random;

/**
 * Created by citsym on 17.02.17.
 */
public class Princess extends Animal implements CanBeFed, CanBeBeFunWith{

    {
        setFoodName("martsupan");
    }

    @Override
    public void drinkABeer() {
        System.out.println("Princess drinks some beer");
        Random ro = new Random();
    }

    @Override
    public void tellAJoke() {
        System.out.println("Princess tels some joke");
    }
}
