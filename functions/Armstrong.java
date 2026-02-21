package functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrong(n));
    }
    private static boolean armstrong(int n) {
        int original=n;
        int sum=0;
        while(n>0) {
            int r=n%10;
            int cube=r*r*r;
            sum+=cube;
            n/=10;
        }
        if(sum==original)
            return true;
        else return false;
    }
}
