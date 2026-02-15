package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class CountEvenDaysOfMonth {
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter number of days in month: ");
//            int days = sc.nextInt();
//            int evenDays = days/2;
//            System.out.println("Sunny can go out "+evenDays+" days.");
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month name: ");
        String month = sc.next().toLowerCase();
        int days = 0;
        switch(month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;

            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;

            case "february":
                days = 28;
                break;

            default:
                System.out.println("Invalid month name");
                return;
        }
        int evenDays = days/2;
        System.out.println("Sunny can go out "+evenDays+" days.");
    }
}