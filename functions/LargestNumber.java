package functions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        largest(a,b,c);
    }
    public static void largest(int a, int b, int c) {
        if(a>b && a>c)
            System.out.println(a+" is greater number");
        else if(b>a && b>c)
            System.out.println(b+" is greater number");
        else{
            System.out.println(c+" is greater number");
        }
    }
}
