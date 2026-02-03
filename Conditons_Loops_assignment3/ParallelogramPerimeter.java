package Conditons_Loops_assignment3;
import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter length of side b: ");
        double b = sc.nextDouble();
        double perimeter = 2 * (a + b);
        System.out.println("Perimeter of the parallelogram = "+perimeter);
    }
}
