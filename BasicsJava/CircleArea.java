package BasicsJava;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = PI * r * r;
        System.out.println(area);
    }
}
