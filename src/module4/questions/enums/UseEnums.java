package module4.questions.enums;

/**
 * Created by citsym on 17.02.17.
 */
public class UseEnums {


    public static void main(String[] args) {

        Months ourMonth = Months.NOVEMBER;

        defineNumberOfHolidaysInMonth(ourMonth);

//        defineNumberOfHolidaysInMonth("LABUDEN");


    }

    private static void defineNumberOfHolidaysInMonth(Months ourMonth) {
        switch (ourMonth) {
            case JANUARY:
            case MAY:
            case MARCH:
                System.out.println("in this month " + ourMonth.getHolidaysCount() + " holidays");
                break;

            default:
                System.out.println("No holidays in month");
        }


    }


//    private static void defineNumberOfHolidaysInMonth(String ourMonth) {
//        switch (ourMonth) {
//            case MonthsNames.JANUARY:
//                System.out.println("in this month 5 holidays");
//                break;
//            case MonthsNames.MAY:
//                System.out.println("in this month 4 holidays");
//                break;
//            case MonthsNames.MARCH:
//                System.out.println("in this month 1 holidays");
//                break;
//            default:
//                System.out.println("No holidays in month");
//
//        }
//
//
//    }


}
