package Conditons_Loops_assignment3;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();
        float pi=3.14f;
        float p = 2*pi*r;
        System.out.println("Perimeter of Circle: "+p);
    }
}
