package arrays;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        boolean flag=false;
        for(int i=0; i<n; i++) {
            if(arr[i]==target) {
                flag = true;
                break;
            }
        }
        if(flag!=false)
            System.out.println("element mil gya");
        else System.out.println("element nahi mila");
    }
}
