package Conditons_Loops_assignment3;

import java.util.Scanner;

public class IsosceleusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        int area = (b*h)/2;
        System.out.println("Area of Isosceles Triangle: "+area);
    }
}
