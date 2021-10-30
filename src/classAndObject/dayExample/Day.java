package classAndObject.dayExample;

public class Day {

    /*
    name
    hours
    weekday or weekend
     */

    static final int hoursInADay = 24;
    static final int daysInAWeek = 7;
    static final int daysInAYear = 365;
    static final int weekdays = 5;
    static final int weekendDays = 2;

    static final String firstDay = "Sunday";
    static final String secondDay = "Monday";
    static final String thirdDay = "Tuesday";
    static final String fourthDay = "Wednesday";
    static final String fifthDay = "Thursday";
    static final String sixthDay = "Friday";
    static final String seventhDay = "Saturday";


    public static void main(String[] args) {
        System.out.println(Day.daysInAWeek);
        System.out.println(Day.daysInAYear);
        System.out.println(Day.sixthDay);
        System.out.println(Day.seventhDay);
    }
}
