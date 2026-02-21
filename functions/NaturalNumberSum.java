package functions;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural number: "+naturalSum(n));
    }
    private static int naturalSum(int x) {
        int s=0;
        for(int i=1; i<=x; i++) {
            s+=i;
        }
        return s;
    }
}
