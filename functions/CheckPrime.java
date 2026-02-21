package functions;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println(n+" is Prime number");
        else System.out.println(n+" not a Prime number");
    }
    private static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
