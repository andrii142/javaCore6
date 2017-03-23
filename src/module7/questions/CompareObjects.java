package module7.questions;

import module4.zoo.mammal.Monkey;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by citsym on 13.03.17.
 */
public class CompareObjects {

    public static void main(String[] args) {


        int[] intArray = {245, 23, 1, 33234, 231, 123};

        Arrays.sort(intArray);

        System.out.println(Arrays.toString(intArray));


        String[] strings = {"resf", "asafw", "hdsjsf", "hdsfjs", "G", "SDFSdfsnjfnsof"};

        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

        List<String> stringList = Arrays.asList(strings);

        Collections.sort(stringList);

        System.out.println(stringList);


        Monkey monkeyMasha = new Monkey("Masha", "Brown");
        monkeyMasha.setFoodCount(5);
        Monkey monkeyNina = new Monkey("Nina", "Orange");
        monkeyNina.setFoodCount(7);
        Monkey monkeyPetya = new Monkey("Petya", "Green");
        monkeyPetya.setFoodCount(7);

        List<Monkey> monkeys = Arrays.asList(monkeyMasha, monkeyNina, monkeyPetya);

        Collections.sort(monkeys);

        for (Monkey monkey : monkeys) {
            System.out.println(monkey.getFoodCount() + " " + monkey.getName());
        }


        Collections.sort(monkeys, new Comparator<Monkey>() {
            @Override
            public int compare(Monkey o1, Monkey o2) {
                int compareResult = o1.getFoodCount() - o2.getFoodCount();

                if (compareResult == 0) {
                    return o1.getSkinColor().compareTo(o2.getSkinColor());
                }

                return compareResult;
            }
        });


        for (Monkey monkey : monkeys) {
            System.out.println(monkey.getFoodCount() + " " + monkey.getName() + " " + monkey.getSkinColor());
        }

    }

}
