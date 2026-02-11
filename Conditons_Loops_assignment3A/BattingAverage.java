package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Runs Scored: ");
        int runs = sc.nextInt();
        System.out.print("Enter Number of Balls play: ");
        int balls = sc.nextInt();

        if(balls != 0) {
            double strikeRate = (double) runs/balls * 100;
            System.out.print("Strike Rate: "+strikeRate);
        } else {
            System.out.println("Balls faced cannot be zero.");
        }
    }
}
