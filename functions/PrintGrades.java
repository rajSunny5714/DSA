package functions;

import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Subjects: ");
        int count = sc.nextInt();
        float totalMarks = calculateTotalMarks(sc, count);
        float percentage = calculatePercentage(totalMarks, count);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        printGrade(percentage);
    }
    public static float calculateTotalMarks(Scanner sc, int count) {
        float total = 0;
        System.out.println("Enter Marks of "+count+" Subjects:");
        for (int i=0; i<count; i++) {
            total += sc.nextInt();
        }
        return total;
    }
    public static float calculatePercentage(float totalMarks, int count) {
        return (totalMarks/(count*100))*100;
    }
    public static void printGrade(float percentage) {
        switch ((int) percentage/10) {
            case 9:
                System.out.println("Grade: A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade: A");
                break;
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Grade: D");
        }
    }
}