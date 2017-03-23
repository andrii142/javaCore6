package module4.zoo.mammal;

import module4.zoo.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 13.03.17.
 */
public class Cage {

    private int area;
    private List<Animal> animals = new ArrayList<>();

    public Cage(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void addAnimalToCage(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAllAnimalsInCage(){
        return animals;
    }

}
