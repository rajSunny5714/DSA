package arrays;

import java.util.Scanner;

public class DisplayPrimeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i=0; i<l; i++) {
            arr[i] = sc.nextInt();
        }
        for(int num : arr) {
            if(isPrime(num)) {
                System.out.print(num+" ");
            }
        }
    }
    private static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
