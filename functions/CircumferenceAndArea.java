package functions;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextInt();
        circumferenceAndArea(r);
    }
    private static void circumferenceAndArea(double r) {
        double area = 3.14*r*r;
        double circumference = 2*3.14*r;
        System.out.println("Area = "+area);
        System.out.println("Circumference = "+circumference);
    }
}
