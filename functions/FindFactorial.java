package functions;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findFactorial(n);
    }
    private static void findFactorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
}
