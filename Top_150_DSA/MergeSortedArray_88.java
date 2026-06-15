package Top_150_DSA;

import java.util.Scanner;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for(int i=0; i<m+n; i++) {
            nums1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            nums2[i] = sc.nextInt();
        }

        MergeSortedArray_88 obj = new MergeSortedArray_88();
        obj.merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num+" ");
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i>=0 && j>=0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
