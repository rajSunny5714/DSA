package functions;

import java.util.Scanner;

public class SwapUsingFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
    private static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
