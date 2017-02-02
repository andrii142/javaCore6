package module2.questions;

import java.util.Arrays;

/**
 * Created by citsym on 02.02.17.
 */
public class UseMultiplyOverflow {

    public static void main(String[] args) {


        int[] randomArray = UseRandomForArrays.getRandomPositiveIntsArray(10, 200);

        System.out.println(Arrays.toString(randomArray));


        long result = multiplyArray(randomArray, randomArray.length - 1);

        System.out.println(result);

    }

    private static long multiplyArray(int[] randomArray, int indexToBegin) {

        if (indexToBegin == 0) {
            return (long) randomArray[indexToBegin];
        }

        return Math.multiplyExact(randomArray[indexToBegin], multiplyArray(randomArray, indexToBegin - 1));
    }

}
