package LeetcodeDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode1431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        System.out.println(kidsWithCandies(arr, c));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int candy : candies) {
            max = Math.max(max, candy);
        }
        for(int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
