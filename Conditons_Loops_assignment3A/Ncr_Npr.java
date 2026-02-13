package Conditons_Loops_assignment3A;

import java.util.Scanner;
public class Ncr_Npr {
    public static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        long ncr = fact(n) / (fact(r) * fact(n - r));
        long npr = fact(n) / fact(n - r);

        System.out.println("nCr = " + ncr);
        System.out.println("nPr = " + npr);
    }
}