package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode4024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and column number:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter value in row and column form:");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] val = new int[2];
        System.out.println("Enter target x and y:");
        val[0] = sc.nextInt();
        val[1] = sc.nextInt();
        System.out.println("Output: "+nearestDrone(arr, val));
    }
    public static int nearestDrone(int[][] drones, int[] target) {
        int minDis = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0; i<drones.length; i++) {
            int x = drones[i][0];
            int y = drones[i][1];
            int range = drones[i][2];
            int dis = Math.abs(x-target[0]) + Math.abs(y-target[1]);
            if(dis<=range && dis<minDis) {
                minDis = dis;
                ans=i;
            }
        }
        return ans;
    }
}
