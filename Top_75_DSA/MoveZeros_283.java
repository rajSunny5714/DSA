package Top_75_DSA;

import java.util.Scanner;

public class MoveZeros_283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i]= sc.nextInt();
        }
        MoveZeros_283 obj = new MoveZeros_283();
        obj.moveZeroes(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
