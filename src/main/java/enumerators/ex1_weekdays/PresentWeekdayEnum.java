package enumerators.ex1_weekdays;

public class PresentWeekdayEnum {
    public static void main(String[] args) {
        Weekday dayMonday = Weekday.MONDAY;
        Weekday daySaturday = Weekday.SATURDAY;

        System.out.println(dayMonday.isHoliday());
        System.out.println(daySaturday.isHoliday());
        daySaturday.whichIsGreater(dayMonday);
        dayMonday.whichIsGreater(daySaturday);
    }
}
