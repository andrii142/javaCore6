package module4.questions;

import java.util.Arrays;

/**
 * Created by citsym on 17.02.17.
 */
public class UseAbstractVsInterface {

    public static void main(String[] args) {

        Shrek shreck = new Shrek();
        Donkey donkey = new Donkey();
        Princess princess = new Princess();
        Robot robot = new Robot();


        CanBeFed[] canBeFedArray = new CanBeFed[0];


        canBeFedArray = addElementToArray(canBeFedArray, shreck);
        canBeFedArray = addElementToArray(canBeFedArray, donkey);
        canBeFedArray = addElementToArray(canBeFedArray, princess);
        canBeFedArray = addElementToArray(canBeFedArray, robot);


        feedAllCanBeFedElements(canBeFedArray);


        fun(shreck);
        fun(princess);
        
    }

    private static void fun(CanBeBeFunWith canBeBeFunWithElement) {
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
