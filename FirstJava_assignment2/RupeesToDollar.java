package FirstJava_assignment2;
import java.util.Scanner;

public class RupeesToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double exchangeRate = 0.012;
        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();
        double dollars = rupees * exchangeRate;
        System.out.println("Amount in Dollars: $" +dollars);
    }
}
