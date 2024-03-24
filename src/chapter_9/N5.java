package chapter_9;

import java.util.GregorianCalendar;

public class N5 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.printf("year: %d, month: %d, day: %d \n",year, month+1, day);


        GregorianCalendar calendarOfElapsedTime = new GregorianCalendar();

        calendarOfElapsedTime.setTimeInMillis(1234567898765L);
        int year_ = calendarOfElapsedTime.get(GregorianCalendar.YEAR);
        int month_ = calendarOfElapsedTime.get(GregorianCalendar.MONTH);
        int day_ = calendarOfElapsedTime.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.printf("year: %d, month: %d, day: %d \n",year_, month_+1, day_);

    }
}
