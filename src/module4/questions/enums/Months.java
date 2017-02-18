package module4.questions.enums;

/**
 * Created by citsym on 17.02.17.
 */
public enum Months {
    JANUARY(5), FEBRUARY, MARCH(1), APRIL, MAY(4), JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    private final int holidaysCount;

    Months(int holidaysCount) {
        this.holidaysCount = holidaysCount;
    }

    Months(){
        this(0);
    }


    public int getHolidaysCount() {
        return holidaysCount;
    }
}
