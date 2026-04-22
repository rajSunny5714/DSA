package arrays.arrayGFG;

import java.util.*;

class PrintAlternate {
    public static void printAlternates(int[] arr) {
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        printAlternates(arr);
    }
}
