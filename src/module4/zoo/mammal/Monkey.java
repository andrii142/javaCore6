package module4.zoo.mammal;

import module4.zoo.Animal;

/**
 * Created by citsym on 16.02.17.
 */
public class Monkey extends Animal implements Comparable<Monkey> {

    private int foodCount;
    private static int foodCountTotal;
    private static Cage monkeyCage = new Cage(20);

    private String skinColor;

    {
        setFoodName("banana");
    }

    public Monkey(String name, String skinColor) {
        setName(name);
        this.skinColor = skinColor;
        monkeyCage.addAnimalToCage(this);
    }


    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int bananasCount) {
        foodCountTotal = foodCountTotal - foodCount;
        this.foodCount = bananasCount;
        foodCountTotal += foodCount;
    }

    public void increaseFoodCount(){
        foodCount++;
        foodCountTotal++;
    }

    public static int getFoodCountTotal() {
        return foodCountTotal;
    }

    public static int countAllMonkeysInCage(){
        return monkeyCage.getAllAnimalsInCage().size();
    }

    @Override
    public int compareTo(Monkey o) {
        return o.getFoodCount() - foodCount;
    }

    public String getSkinColor() {
        return skinColor;
    }
}
