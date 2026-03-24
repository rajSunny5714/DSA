package arrays.leetcodeArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        GreatestNumberOfCandies obj = new GreatestNumberOfCandies();
        List<Boolean> res = obj.kidsWithCandies(arr, extraCandies);

        System.out.println(res);
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCan = 0;
        for(int i : candies) {
            maxCan = Math.max(maxCan, i);
        }
        for(int i : candies) {
            if(i + extraCandies >= maxCan) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
