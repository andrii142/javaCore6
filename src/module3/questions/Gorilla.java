package module3.questions;

/**
 * Created by citsym on 10.02.17.
 */
public class Gorilla {

    private int armsAmount = 2;
    private int legsAmount = 2;
    private BloodSystem bloodSystem = new BloodSystem();

     int nutsCount  =10;

    private String name;

    private String secondName = "Pupkinu";




    public Gorilla(int nutsCountInput, String name) {
        this.name = name;
        setNutsCount(nutsCountInput);
        System.out.println("Legs + Arms = " + getArmsAmount() + getLegsAmount() );
    }

    public int getArmsAmount() {
        return armsAmount;
    }

    public int getLegsAmount() {
        return legsAmount;
    }


    public void increase(){
        nutsCount++;
    }

    public void setNutsCount(int nutsCount) {
        if (nutsCount > 1500) {
            System.out.println("Gorilla "+  name +" is in danger - it can be too much ");
            return;
        }
        this.nutsCount = nutsCount;
        System.out.println("Log : gorilla" + name + " received " +  nutsCount);
    }

    public BloodSystem getBloodSystem() {
        return bloodSystem;
    }

    public String getName() {
        return name + " " + secondName;
    }


    public int getNutsCount() {
        return nutsCount;
    }

    class BloodSystem {
       private int bloodLiters = 6;


        public  BloodSystem(){
            Gorilla.this.increase();
            this.increase();
        }

        void increase(){
            if (nutsCount> 100) {
                bloodLiters++;
            }
        }

        public int getBloodLiters() {
            return bloodLiters;
        }
    }
}
