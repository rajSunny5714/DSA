package arrays;

import java.util.Scanner;

public class CountOddNEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e=0, o=0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0) e++;
            else o++;
        }
        System.out.println("Even elements: "+e+"\nOdd Elements: "+o);
    }
}
