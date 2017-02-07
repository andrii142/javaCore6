package module2;

/**
 * Created by citsym on 27.01.17.
 */
public class UseArrays {

    public static void main(String[] args) {

        int orange1 = 1;
        int orange2 = 2;
        int orange3 = 3;
        int orange4 = 4;
        int orange5 = 5;
        int orange6 = 6;
        int orange7 = 7;


        for (int i = 1; i < 7; i++) {

            if (i == 1) {
                System.out.println("Clean orange1 " + orange1);
            } else if (i == 2){
                System.out.println("Clean orange2 " + orange2);
            } else if (i == 3) {
                System.out.println("Clean orange3 " + orange3);
            }
        }


        System.out.println("===================");

        int[] arrayOfOranges = new int[7];

        // We already eaten 106 oranges
        arrayOfOranges[0] = 107;
        arrayOfOranges[1] = 108;
        arrayOfOranges[2] = 109;
        arrayOfOranges[3] = 110;
        arrayOfOranges[4] = 111;
        arrayOfOranges[5] = 112;
        arrayOfOranges[6] = 113;


        for (int i = 0; i < arrayOfOranges.length; i++) {
            System.out.println("Clean orange" +arrayOfOranges[i] + " "+ arrayOfOranges[i]);
        }


        int[] arrayOfOrangesSimple = {212 ,123 , 234, 345, 5443};


        for (int execItem : arrayOfOrangesSimple) {
            System.out.println(execItem);

        }



        String[] names = {"Vasya", "Kolya", "Petya","Vasya2", "Kolya2", "Petya2","Vasya3", "Kolya3", "Petya3", "Nastya"};

        StringBuilder sb =  new StringBuilder("");

        for (String execName : names) {

            sb.append(execName).append(",");

        }

        System.out.println(sb.toString());



        String result2 = "";


        for (int i = 0; i < names.length; i++) {

            if (i == 3){
                continue;
            }

            if (i > 5){
                break;
            }
            String execName = names[i];
            result2 +=  execName + ",";
        }

        System.out.println(result2);

    }
}
