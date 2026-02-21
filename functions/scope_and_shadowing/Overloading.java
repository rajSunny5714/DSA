package functions.scope_and_shadowing;

import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sum();
        sum(a, b);
        sum(a, b, c);
    }

    static void sum() {
        System.out.println("No Arguments");
    }
    static void sum(int a, int b) {
        System.out.println("Sum of two numbers = "+(a+b));
    }

    static void sum(int a, int b, int c) {
        System.out.println("Sum of three numbers = "+(a+b+c));
    }
}