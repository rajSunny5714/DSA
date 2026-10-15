package LeetcodeDSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Leetcode2913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<s; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Output: "+sumCounts(arr));
    }
    public static int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++) {
            HashSet<Integer> set = new HashSet<>();
            for(int j=i; j<nums.size(); j++) {
                set.add(nums.get(j));
                int cnt = set.size();
                sum += cnt * cnt;
            }
        }
        return sum;
    }
}
