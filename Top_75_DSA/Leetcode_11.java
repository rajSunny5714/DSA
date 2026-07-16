package Top_75_DSA;

import java.util.Scanner;

public class Leetcode_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] height = new int[n];
        for(int i=0; i<n; i++) {
            height[i] = sc.nextInt();
        }
        int result = maxArea(height);
        System.out.println(result);
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while(left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int area = width * currentHeight;

            maxWater = Math.max(maxWater, area);
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxWater;
    }
}
