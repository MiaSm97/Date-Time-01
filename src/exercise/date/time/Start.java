package exercise.date.time;

import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int daysBetween = today.lengthOfMonth() - today.getDayOfMonth();
        int daysLeft = today.lengthOfYear() - today.getDayOfYear();

        System.out.println("Today: " + today);
        System.out.println("Days till end of month: " + daysBetween);
        System.out.println("Days till end of year: " + daysLeft);


    }
}
    /*using LocaleDate, calculate and print:
        how many days are left till the end of the month
        how many days are left till the end of the year, using the length() method from java.time.Year.of()*/