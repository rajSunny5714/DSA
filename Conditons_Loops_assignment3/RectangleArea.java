package Conditons_Loops_assignment3;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int b = sc.nextInt();
        int a = l*b;
        System.out.println("Area of Rectangle: "+a);
    }
}
