package functions;

import java.util.Scanner;

public class PrimeBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end number");
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int i=s; i<=e; i++) {
            if(isPrime(i)) System.out.print(i+" ");
        }
    }
    private static boolean isPrime(int n) {
        if(n<=2) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
