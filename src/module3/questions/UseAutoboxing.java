package module3.questions;

import module3.offline.NissanJukeCar;

/**
 * Created by citsym on 10.02.17.
 */
public class UseAutoboxing {

    public static void main(String[] args) {




        // rare used
//      Float  float
//      Byte   byte     // 0000 0000
//      Short  short    // 0000 0000 0000 0000
//
//
//        // often used
//     Integer    int
//     Long       long
//     Double      double
//     Character    char


        byte byteType = 2 ; // 0000 0010

        Byte byteObjectType = 2; // 0100 0101 0110 0110 1000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000

        Long objectLongType = 6L ;
        long longType = 6L;

        NissanJukeCar car = new NissanJukeCar("red");

        Integer integerObject = 1;

        Integer integer = 1;

//        process(integerObject);


        String string = "6";
        Long parseNumber =  Long.parseLong(string);


        sout(parseNumber);

//======================================
        String stringDouble = "6.4355443543";

        Double d =  Double.parseDouble(stringDouble);

        sout(d);

        process((long)integer);

    }



    private static void sout(Double d) {
        System.out.println(d.getClass().getSimpleName() + " number " + d );
    }

    private static void sout(Long number) {
        System.out.println(number.getClass().getSimpleName() +" number " + number);
    }
//
//    private static void process(int o) {
//        System.out.println("int " + o);
//    }

    private static void process(Long o) {
        System.out.println("long " + o);
    }
//
//    private static void process(Object o) {
//        System.out.println(o.getClass().getSimpleName());
//    }
}
