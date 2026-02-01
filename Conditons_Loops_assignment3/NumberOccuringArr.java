package Conditons_Loops_assignment3;

import java.util.Scanner;

public class NumberOccuringArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Target: ");
        int target=sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                cnt++;
            }
        }
        System.out.println("Number Ocurring: "+cnt);
    }
}
