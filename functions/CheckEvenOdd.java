package functions;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkEvenOdd(n);
    }
    private static void checkEvenOdd(int n) {
        if(n%2==0){
            System.out.println(n+" Even number.");
        }else{
            System.out.println(n+" Odd number.");
        }
    }
}
