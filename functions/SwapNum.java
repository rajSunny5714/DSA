package functions;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        swap(x,y);
    }
    private static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
