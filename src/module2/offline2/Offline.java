package module2.offline2;

import java.util.Arrays;

/**
 * Created by citsym on 28.01.17.
 */
public class Offline {

    public static final int ZERO = 0;

    public static void main(String[] args) {

        int[] balances = { 500, 9000, 7500, 234, 4534, 9985, 100, 3443, 5000, 4600 };

        // sum calculation

        System.out.println(sumCalculationWithBounds(balances, 1000, 5000));


        // filter names who has balance > 1000

        String[] names = {"Vasya", "Kolya", "Petya","Vasya2", "Kolya2", "Petya2","Vasya3", "Kolya3", "Petya3", "Nastya"};

        String[] filteredNames = new String[names.length];

        int index = 0;

        for (int i = 0; i < names.length; i++) {

            if (balances[i] > 1000) {
                System.out.println(names[i] + " balance " + balances[i]);
                filteredNames[index] = names[i];
                index ++ ;
            }
        }

        for (String filteredName : filteredNames) {
            if (filteredName != null) {
                System.out.println(filteredName);
            }
        }


        System.out.println(Arrays.toString(filteredNames));


        // Add new element to names Array
        String[] newArrayNames = Arrays.copyOf(names, names.length +1);

        newArrayNames[newArrayNames.length - 1]  = "Olya";


        System.out.println(Arrays.toString(newArrayNames));

    }

    private static int sumCalculationWithBounds(int[] balances, int leftBound, int rightBound) {
        int sum = ZERO;

        for (int balanceCurrentValue : balances) {

            if (balanceCurrentValue > leftBound && balanceCurrentValue < rightBound) {

                sum += balanceCurrentValue;

            }

        }

//        System.out.println(sum);
        return sum;
    }
}
