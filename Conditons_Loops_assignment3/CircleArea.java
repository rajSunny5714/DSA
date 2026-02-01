package Conditons_Loops_assignment3;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = (22.0f / 7) * r * r;
        System.out.println("Area of circle: " + area);
    }
}
