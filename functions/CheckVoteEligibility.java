package functions;

import java.util.Scanner;

public class CheckVoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(checkVoteEligibility(age)) System.out.println("Eligible for vote");
        else System.out.println("Not eligible for vote");
    }
    private static boolean checkVoteEligibility(int n) {
        if(n>=18)
            return true;
        else
            return false;
    }
}
