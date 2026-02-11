import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting and Ending number:");
        int s = sc.nextInt();
        int e = sc.nextInt();
        double avg = (double)(s + e) / 2;
        System.out.println("Average: " + avg);
    }
}