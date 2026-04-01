package arrays.leetcodeArray;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPowerOfTwo(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static boolean isPowerOfTwo(int n) {
        int ans = 1;
        for(int i = 0; i <= 30; i++) {
            if(ans == n)
                return true;
            if(ans < Integer.MAX_VALUE / 2)
                ans = ans * 2;
        }
        return false;
    }
}