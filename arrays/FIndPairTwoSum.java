package arrays;

import java.util.Scanner;

public class FIndPairTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[2];
        int target = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        for(int res:ans){
            System.out.print(res+" ");
        }
    }
}
