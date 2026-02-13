package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of subject: ");
        int s = sc.nextInt();
        double s1 = 0;
        System.out.println("Enter each subject marks:");
        for(int i=0; i<s; i++) {
            double j = sc.nextDouble();
            s1+=j;
        }
        float avg = (float) (s1/s);
        System.out.println("Marks Average: "+avg);
    }
}
