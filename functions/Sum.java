package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(add(a,b));
    }
    private static double add(double n1, double n2) {
        double sum = n1+n2;
        return sum;
    }
}
