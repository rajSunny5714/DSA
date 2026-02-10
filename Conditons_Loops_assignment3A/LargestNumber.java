package Conditons_Loops_assignment3A;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter numbers (0 to stop):");
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter integers only.");
                sc.next();
                continue;
            }
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num > largest) {
                largest = num;
            }
        }
        if(largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + largest);
        }
    }
}