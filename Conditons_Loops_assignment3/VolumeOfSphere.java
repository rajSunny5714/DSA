package Conditons_Loops_assignment3;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double volume = (4.0 / 3) * Math.PI * r * r * r;
        System.out.println("Volume of Sphere: "+volume);
    }
}
