package swich_Assignment4;

import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter 1 to swap: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                int temp = a;
                a = b;
                b = temp;
                System.out.println("First number: "+a);
                System.out.println("Second number: "+b);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
