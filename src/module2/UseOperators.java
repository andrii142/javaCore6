package module2;

/**
 * Created by citsym on 27.01.17.
 */
public class UseOperators {
    public static void main(String[] args) {

        int integer1 = 55;
        int integer2 = 10;

        int integer3 = integer1 + integer2;

        System.out.println(integer3);

        double doubleValue =  (double)integer2 / integer1;

        System.out.println(doubleValue);

        integer3 = integer1 % integer2;

        System.out.println("% :" + integer3);


        int integer4 = 100;

        integer4 = integer4 + 10;

        integer4 += 10;


        integer4 += 1;


        integer4++;



        char charValue1 = '~';
        char charValue2 = ',';

        System.out.println(charValue1 % charValue2);


        boolean handsome = true; // 1
        boolean reach = false;  // 0

        boolean isRadaAvailable = handsome && reach;


        System.out.println(isRadaAvailable);

        // 1 AND 0 = 0
        // 0 AND 1 = 0
        // 0 AND 0 = 0
        // 1 AND 1 = 1


        boolean danceClubAvailable =  handsome || reach;


        System.out.println("URA i`m in dance club : " + danceClubAvailable);

        // 1 OR 0 = 1
        // 0 OR 1 = 1
        // 0 OR 0 = 0
        // 1 OR 1 =     1

        System.out.println(!handsome);


    }
}
