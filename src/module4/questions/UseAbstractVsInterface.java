package module4.questions;

import java.util.Arrays;

/**
 * Created by citsym on 17.02.17.
 */
public class UseAbstractVsInterface {

    public static void main(String[] args) {

        PeopleEater shreck = new PeopleEater();
        Donkey donkey = new Donkey();
        Princess fiona = new Princess();
        Robot robot = new Robot();


        CanBeFed[] canBeFedArray = new CanBeFed[0];


        canBeFedArray = addElementToArray(canBeFedArray, shreck);
        canBeFedArray = addElementToArray(canBeFedArray, donkey);
        canBeFedArray = addElementToArray(canBeFedArray, fiona);
        canBeFedArray = addElementToArray(canBeFedArray, robot);


        feedAllCanBeFedElements(canBeFedArray);


        fun(shreck);
        fun(fiona);


        CanBeBeFunWith cat = new CanBeBeFunWith() {
            @Override
            public void drinkABeer() {
                System.out.println("Car drinks beer too");
            }

            @Override
            public void tellAJoke() {
                System.out.println("Can likes to tell jokes");
            }
        };
        fun(cat);

    }

    public static void fun(CanBeBeFunWith canBeBeFunWithElement) {
        canBeBeFunWithElement.drinkABeer();
        canBeBeFunWithElement.tellAJoke();
    }

    private static void feedAllCanBeFedElements(CanBeFed[] canBeFedArray) {
        for (CanBeFed canBeFed : canBeFedArray) {
            canBeFed.feed();
        }
    }

    private static CanBeFed[] addElementToArray(CanBeFed[] canBeFedArray, CanBeFed canBeFedElement) {
        CanBeFed[] newArray = Arrays.copyOf(canBeFedArray, canBeFedArray.length + 1);
        newArray[newArray.length - 1] = canBeFedElement;
        return newArray;
    }


}
