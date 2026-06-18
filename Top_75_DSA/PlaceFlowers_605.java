package Top_75_DSA;

import java.util.Scanner;

public class PlaceFlowers_605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flower = new int[n];
        for(int i=0; i<n; i++) {
            flower[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        boolean result = canPlaceFlowers(flower, p);

        System.out.print(result);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i]==0) {
                boolean leftEmpty = (i==0) || (flowerbed[i-1]==0);
                boolean rightEmpty = (i==flowerbed.length-1) || (flowerbed[i+1]==0);
                if(leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
            if(count>=n) {
                return true;
            }
        }
        return count>=n;
    }
}
