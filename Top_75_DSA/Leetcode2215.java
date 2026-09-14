package Top_75_DSA;

import java.util.*;

public class Leetcode2215 {
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
        System.out.println("Output: "+findDifference(arr1, arr2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }
        for(int num : nums2) {
            set2.add(num);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int num : set1) {
            if(!set2.contains(num)) {
                list1.add(num);
            }
        }
        for(int num : set2) {
            if(!set1.contains(num)) {
                list2.add(num);
            }
        }
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);

        return answer;
    }
}
