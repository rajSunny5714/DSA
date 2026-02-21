package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class CheckPythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a,b,c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(pythagorean(a,b,c)) {
            System.out.println("Pythagorean Theorem Satisfied");
        }else System.out.println("Not Satisfied Pythagorean Theorem");
    }
    private static boolean pythagorean(int x, int y, int z) {
        if((x*x+y*y)==z*z) {
            return true;
        }else{
            return false;
        }
    }
}
