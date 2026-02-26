package arrays;

import java.util.Scanner;

public class DIspLay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i=0;
        while(i<n){
            arr[i]= sc.nextInt();
            i++;
        }
        i=0;
        while(i<n){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
