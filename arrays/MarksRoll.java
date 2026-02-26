package arrays;

import java.util.Scanner;

public class MarksRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        for(int roll=0; roll<n; roll++) {
            marks[roll] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(marks[i]<35)
                System.out.print(i+" ");
        }
    }
}
