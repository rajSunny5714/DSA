package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:  ");
        int s = sc.nextInt();
        int[] arr1 = new int[s];
        System.out.println("Enter elements of the array1:");
        for(int i=0; i<s; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[s];
        System.out.println("Enter elements of the array1:");
        for(int i=0; i<s; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Output: "+isRectangleOverlap(arr1, arr2));
    }
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec1[2] <= rec2[0] || rec1[0] >= rec2[2] || rec1[3] <= rec2[1] || rec1[1] >= rec2[3]) {
            return false;
        }
        return true;
    }
}
