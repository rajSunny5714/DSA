package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a,b));
    }
    private static int lcm(int a, int b) {
        int x = a, y = b;
        while (y!=0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        return (a * b) / gcd;
    }
}
