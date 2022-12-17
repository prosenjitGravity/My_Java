package Aptitude.Calendar;

import java.time.LocalDate;
import java.util.Locale;

public class LocalDate1 {
    public static void main(String[] args) {
        LocalDate dt=LocalDate.of(2022, 11,21);
        System.out.println(dt.getDayOfWeek());
    }
}
