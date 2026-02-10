package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
                continue;
            }
            num = sc.nextInt();
            if(num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of all entered numbers: "+sum);
    }
}