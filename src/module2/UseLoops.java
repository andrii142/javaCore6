package module2;

/**
 * Created by citsym on 27.01.17.
 */
public class UseLoops {

    public static void main(String[] args) {

        boolean yang = true;
        int years = 0;

        while (yang) {

            years++;

            if (years > 40){
                break;
//                yang = false;
            }

            if (years < 10){
                continue;
            }

            System.out.println("PLAY THE COMPUTER GAMES");
        }

        boolean weLoveIt = false;

        do {
            System.out.println("TRY PLAY THE COMPUTER GAMES");
        } while (weLoveIt);


        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print("DO SMTH ELSE " + j + "   ||||||");
            }

            if (i < 5){
                continue;
            }

            System.out.println("DO SMTH " + i);
        }




    }
}
