package arrays.arrayGFG;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod){
        if(n==0) {
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Disk "+n+" moved from "+fromRod+" to "+toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
}
