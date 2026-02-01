import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n <= 1) {
            System.out.println("not a prime number");
            return;
        }
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                isPrime=false;
                break;
            }
        }
        if(!isPrime)
            System.out.print("not a prime number");
        else
            System.out.print("prime number");
    }
}
