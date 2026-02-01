package FirstJava_assignment2;
import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(num>0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers between " +start + " and " + end + ":");
        for(int i=start; i<=end; i++) {
            if(isArmstrong(i)) {
                System.out.print(i +" ");
            }
        }
    }
}
