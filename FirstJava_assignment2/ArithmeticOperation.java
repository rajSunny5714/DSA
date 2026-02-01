package FirstJava_assignment2;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int multi=a*b;
        int div=a/b;
        int rem=a%b;
        System.out.println("Add: "+sum+"\nSub: "+sub+"\nMultiply: "+multi+"\nDivision: "+div+"\nRemainder: "+rem);
    }
}
