package LeetcodeDSA;

import java.util.*;

public class Leetcode1386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of reserved seats: ");
        int m = sc.nextInt();
        int[][] reservedSeats = new int[m][2];
        System.out.println("Enter the reserved seats (row seat):");
        for(int i=0; i<m; i++) {
            reservedSeats[i][0] = sc.nextInt();
            reservedSeats[i][1] = sc.nextInt();
        }
        int res = maxNumberOfFamilies(n, reservedSeats);
        System.out.println("Result: "+res);
    }
    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> reserved = new HashMap<>();
        for(int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            if(col>=2 && col<=9) {
                reserved.computeIfAbsent(row, k -> new HashSet<>()).add(col);
            }
        }
        int answer = (n - reserved.size()) * 2;
        for(Set<Integer> seats : reserved.values()) {
            boolean left = true;
            boolean middle = true;
            boolean right = true;
            for(int i=2; i<=5; i++) {
                if(seats.contains(i)) {
                    left = false;
                    break;
                }
            }
            for(int i=4; i<=7; i++) {
                if(seats.contains(i)) {
                    middle = false;
                    break;
                }
            }
            for(int i=6; i<=9; i++) {
                if(seats.contains(i)) {
                    right = false;
                    break;
                }
            }
            if(left && right) {
                answer += 2;
            }
            else if(left || middle || right) {
                answer += 1;
            }
        }
        return answer;
    }
}
