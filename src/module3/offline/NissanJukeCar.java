package module3.offline;

import java.util.Arrays;

/**
 * Created by citsym on 09.02.17.
 */
public class NissanJukeCar {

    Wheal[] wheels = new Wheal[4];
    double engineValue = 1.6;
    int doorsAmount = 5;
    double petrolBy100km = 12;
    String name = "SPORT";

    String color;


    public boolean goToDestination(String cityName) {

        for (Wheal wheel : wheels) {
            if (wheel == null){
               return false;
            }
        }

        System.out.println("UHU! We are in " + cityName);


//        goToDestination( cityName);  DO NOT DECOMMENT - WHOULD BE STACK_OVERFLOW_ERROR
        return true;
    }

    public boolean goToDestination(String cityName, int distance, String[] passangers) {

        for (Wheal wheel : wheels) {
            if (wheel == null){
                return false;
            }
        }

        double petrolLost = distance/100 * petrolBy100km;

        System.out.println("UHU!  We are in " + cityName + " But lost " + petrolLost +" liters");

        System.out.println(Arrays.toString(passangers));
        return true;
    }


    public NissanJukeCar(String color) {
        this.color = color;
    }


    public NissanJukeCar(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }

    public NissanJukeCar(double engineValue, double petrolBy100km) {
        this.engineValue = engineValue;
        this.petrolBy100km = petrolBy100km;
    }


    public NissanJukeCar(double engineValue, int doorsAmount, double petrolBy100km, String name, String color) {
        this.engineValue = engineValue;
        this.doorsAmount = doorsAmount;
        this.petrolBy100km = petrolBy100km;
        this.name = name;
        this.color = color;
    }


    public NissanJukeCar(int doorsAmount, double engineValue,  double petrolBy100km, String name, String color) {
        this.engineValue = engineValue;
        this.doorsAmount = doorsAmount;
        this.petrolBy100km = petrolBy100km;
        this.name = name;
        this.color = color;
    }


}
