package Conditons_Loops_assignment3A;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Obtained Marks: ");
        double obtained = sc.nextDouble();
        System.out.print("Enter Total Marks: ");
        double total = sc.nextDouble();

        if(total != 0) {
            double percentage = (obtained/total)*100;
            System.out.println("Percentage: "+percentage);
            double cgpa = percentage / 9.5;
            System.out.println("Equivalent CGPA: "+cgpa);
        } else {
            System.out.println("Total marks cannot be zero.");
        }
    }
}