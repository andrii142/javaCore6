package module2.questions;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by citsym on 02.02.17.
 */
public class UseRandomForArrays {

    static Random randomGenerator = new Random();

    public static void main(String[] args) {


        // заполняем массив произвольными позитивными значениями

        int[] randomArray = getRandomPositiveIntsArray(100, 650);

        System.out.println(Arrays.toString(randomArray));

        // заполняем массив произвольными позитивными и негативными значениями

        int[] randomArray2 = getRandomIntsArray(100, 650);

        System.out.println(Arrays.toString(randomArray2));

    }

    public static int[] getRandomIntsArray(int length, int maxPossibleValueInArray) {
        int[] randomArray2 = new int[length];

        for (int i = 0; i < randomArray2.length; i++) {

            randomArray2[i] = getRandomInteger(maxPossibleValueInArray);

        }
        return randomArray2;
    }

    public static int[] getRandomPositiveIntsArray(int length, int maxPossibleValueInArray) {
        int[] randomArray = new int[length];

        for (int i = 0; i < randomArray.length; i++) {

            randomArray[i] = getRandomPositiveInteger(maxPossibleValueInArray);

        }
        return randomArray;
    }

    public static int getRandomPositiveInteger(int maxValue) {

        int randomValue =  (int) (Math.random() * maxValue);

        return randomValue;
    }

    private static int getRandomInteger(int maxValue) {

        int randomPositiveInt = randomGenerator.nextInt(maxValue);
        int randomValue = randomGenerator.nextBoolean() ? randomPositiveInt : -1 * randomPositiveInt;

        // та же логика что и делает тернарный оператор сверху
//        if (randomGenerator.nextBoolean()){
//            randomValue = randomPositiveInt;
//        } else {
//            randomValue = -1 * randomPositiveInt;
//        }

        return randomValue;
    }
}
