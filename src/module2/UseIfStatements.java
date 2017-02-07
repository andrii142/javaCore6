package module2;

/**
 * Created by citsym on 27.01.17.
 */
public class UseIfStatements {

    public static void main(String[] args) {

        boolean yang = true;
        boolean handsome = true; // 1
        boolean reach = false;  // 0

        boolean isRadaAvailable = handsome && reach;


        System.out.println(isRadaAvailable);

        // 1 AND 0 = 0
        // 0 AND 1 = 0
        // 0 AND 0 = 0
        // 1 AND 1 = 1


        boolean danceClubAvailable = handsome || reach;


        System.out.println("URA i`m in dance club : " + danceClubAvailable);

        // 1 OR 0 = 1
        // 0 OR 1 = 1
        // 0 OR 0 = 0
        // 1 OR 1 =     1

        System.out.println(!handsome);


        if (danceClubAvailable) {
            System.out.println("DANCE!!!!");
        }


        if ((yang || handsome) && reach) {
            System.out.println("YOU ARE LUKY, BUT NEVER NO IT");
        } else if (isRadaAvailable) {
            System.out.println("YOU are still LUCKY ");
        } else {
            System.out.println("YOUR ARE NOT SO LUCKY");
        }

        if (  yang || handsome && reach ) {
            System.out.println("YOUR ARE LUCKY");
        }


    }

}
