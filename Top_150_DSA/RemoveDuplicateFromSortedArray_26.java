package Top_150_DSA;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        RemoveDuplicateFromSortedArray_26 obj = new RemoveDuplicateFromSortedArray_26();
        int k = obj.removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);
        for(int i=0; i<k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
