package functions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(product(n,m));
    }
    private static int product(int a, int b) {
        int p = a*b;
        return p;
    }
}
