package functions;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        swap();
    }
    private static void swap() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x+" "+y);
    }
}
