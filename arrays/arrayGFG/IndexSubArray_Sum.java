package arrays.arrayGFG;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexSubArray_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println(result);
    }
    private static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        long sum = 0;
        for(int end=0; end<arr.length; end++) {
            sum += arr[end];
            while(sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }
            if(sum == target) {
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}