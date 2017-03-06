package module4.questions;

import module4.zoo.Animal;

/**
 * Created by citsym on 17.02.17.
 */
public class PeopleEater extends Animal implements CanBeFed, CanBeBeFunWith {

//    @Override
//    public void feed(){
//        System.out.println("PeopleEater eats people");
//    }


    {
        setFoodName("people");
    }

    @Override
    public void drinkABeer() {
        System.out.println("PeopleEater drinks a lot of beer");
    }

    @Override
    public void tellAJoke() {
        System.out.println("Shreck tells stupid joke");
    }
}
