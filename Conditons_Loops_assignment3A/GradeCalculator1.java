package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class GradeCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        double totalGradePoints = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade point of subject "+i+": ");
            totalGradePoints += sc.nextDouble();
        }
        double gpa = totalGradePoints/subjects;
        System.out.print("Enter number of semesters: ");
        int semesters = sc.nextInt();
        double totalGPA = gpa;
        for (int i=2; i<=semesters; i++) {
            System.out.print("Enter GPA of semester " +i+ ": ");
            totalGPA += sc.nextDouble();
        }
        double cgpa = totalGPA/semesters;
        double percentage = cgpa*9.5;

        System.out.println("GPA: "+gpa);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Percentage: "+percentage);
    }
}
