package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode3723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = sc.nextInt();
        System.out.print("Enter sum: ");
        int s = sc.nextInt();

        System.out.println("Output: "+maxSumOfSquares(n, s));
    }
    public static String maxSumOfSquares(int num, int sum) {
        if(sum>num*9) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while(sum>=9) {
            sb.append('9');
            sum -= 9;
            num--;
        }
        if(sum>0) {
            sb.append(sum);
            num--;
        }
        while(num > 0) {
            sb.append('0');
            num--;
        }
        return sb.toString();
    }
}
