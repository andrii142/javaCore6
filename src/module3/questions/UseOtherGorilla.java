package module3.questions;

/**
 * Created by citsym on 10.02.17.
 */
public class UseOtherGorilla {
    public static void main(String[] args) {

        Gorilla gorillaVasya = new Gorilla(20, "Vasya");

        gorillaVasya.setNutsCount(2000);

        System.out.println(gorillaVasya.getNutsCount());
    }
}
