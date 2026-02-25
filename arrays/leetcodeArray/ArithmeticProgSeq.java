package arrays.leetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticProgSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        if(canMakeArithmeticProgression(arr))
            System.out.println("Yes, it can form Arithmetic Progression");
        else
            System.out.println("No, it cannot form Arithmetic Progression");
    }
    private static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=2; i<arr.length; i++) {
            if(arr[i]-arr[i-1]!=diff)
                return false;
        }
        return true;
    }
}