package module4.questions;

import module4.zoo.Animal;

/**
 * Created by citsym on 17.02.17.
 */
public class Shrek extends Animal implements CanBeFed, CanBeBeFunWith {

//    @Override
//    public void feed(){
//        System.out.println("Shrek eats people");
//    }


    {
        setFoodName("people");
    }

    @Override
    public void drinkABeer() {
        System.out.println("Shrek drinks a lot of beer");
    }

    @Override
    public void tellAJoke() {
        System.out.println("Shreck tells stupid joke");
    }
}
