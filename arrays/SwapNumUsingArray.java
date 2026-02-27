package arrays;

import java.util.Scanner;

public class SwapNumUsingArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] result = swap(x, y);
            x = result[0];
            y = result[1];
            System.out.println(x+" "+y);
        }
        private static int[] swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
            return new int[]{a, b};
        }
}
