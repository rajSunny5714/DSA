package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();
        while(num>0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if(sum==original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }

}
