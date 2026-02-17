package swich_Assignment4;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;

public class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month name: ");
        String monthStr = sc.next();
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        Month month = Month.valueOf(monthStr.toUpperCase());
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        switch(dayOfWeek) {
            case MONDAY:
                System.out.println("The day is Monday");
                break;
            case TUESDAY:
                System.out.println("The day is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("The day is Wednesday");
                break;
            case THURSDAY:
                System.out.println("The day is Thursday");
                break;
            case FRIDAY:
                System.out.println("The day is Friday");
                break;
            case SATURDAY:
                System.out.println("The day is Saturday");
                break;
            case SUNDAY:
                System.out.println("The day is Sunday");
                break;
        }
    }
}