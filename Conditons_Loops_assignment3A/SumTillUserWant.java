package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class SumTillUserWant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;
        System.out.println("Enter numbers (0 to till you want and press 0 to stop):");
        while (true) {
            num = sc.nextInt();
            if (num==0) break;
            if (num<0) {
                negSum += num;
            }
            else if (num%2 == 0) {
                posEvenSum += num;
            }
            else {
                posOddSum += num;
            }
        }
        System.out.println("Sum of Negative Numbers: "+negSum);
        System.out.println("Sum of Positive Even Numbers: "+posEvenSum);
        System.out.println("Sum of Positive Odd Numbers: "+posOddSum);
    }
}
