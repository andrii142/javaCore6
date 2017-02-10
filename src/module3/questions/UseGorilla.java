package module3.questions;

/**
 * Created by citsym on 10.02.17.
 */
public class UseGorilla {
    public static void main(String[] args) {

        Gorilla gorillaLucy = new Gorilla(100, "Lucy");

        System.out.println("Arms amount " + gorillaLucy.getArmsAmount());

        System.out.println("Blood liters of Lucy " + gorillaLucy.getBloodSystem().getBloodLiters());


        gorillaLucy.setNutsCount(1000);


        UseOtherGorilla.main(new String[0]);


        System.out.println(gorillaLucy.getName());


    }
}
