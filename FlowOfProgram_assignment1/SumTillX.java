package FlowOfProgram_assignment1;
import java.util.Scanner;

public class SumTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Enter a number (or x to stop): ");
            String input = sc.next();
            if(input.equalsIgnoreCase("x")) {
                break;
            }
            int num = Integer.parseInt(input);
            sum += num;
        }
        System.out.println("Sum of all numbers = "+sum);
    }
}