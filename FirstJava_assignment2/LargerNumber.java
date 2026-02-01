package FirstJava_assignment2;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
            System.out.println("a is greater");
        else if(a==b)
            System.out.println("both number are equal");
        else{
            System.out.println("b is greater");
        }
    }
}
