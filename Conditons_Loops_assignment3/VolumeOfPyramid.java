package Conditons_Loops_assignment3;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseArea = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = baseArea*height/3;
        System.out.println("Volume of Pyramid: "+volume);
    }
}