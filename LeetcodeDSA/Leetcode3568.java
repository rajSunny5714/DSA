package LeetcodeDSA;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Leetcode3568 {
    private static class State {
        int x, y, energyLeft, mask, moves;
        State(int x, int y, int energyLeft, int mask, int moves) {
            this.x = x;
            this.y = y;
            this.energyLeft = energyLeft;
            this.mask = mask;
            this.moves = moves;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] classroom = new String[m];

        System.out.println("Enter classroom grid row by row:");
        for(int i=0; i<m; i++) {
            classroom[i] = sc.nextLine();
        }
        System.out.print("Enter maximum energy: ");
        int energy = sc.nextInt();
        int answer = minMoves(classroom, energy);
        System.out.println("Minimum Moves = " + answer);

    }

    public static int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int startX = 0, startY = 0;
        int[][] litterIndex = new int[m][n];
        for(int[] row : litterIndex)
            Arrays.fill(row, -1);
        int litterCount = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                char ch = classroom[i].charAt(j);
                if(ch == 'S') {
                    startX = i;
                    startY = j;
                } else if(ch == 'L') {
                    litterIndex[i][j] = litterCount++;
                }
            }
        }
        int targetMask = (1 << litterCount) - 1;
        Queue<State> queue = new LinkedList<>();
        boolean[][][][] visited = new boolean[m][n][energy + 1][1 << litterCount];

        queue.offer(new State(startX, startY, energy, 0, 0));
        visited[startX][startY][energy][0] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while(!queue.isEmpty()) {
            State curr = queue.poll();

            if(curr.mask == targetMask)
                return curr.moves;
            for(int d=0; d<4; d++) {
                int nx = curr.x + dx[d];
                int ny = curr.y + dy[d];

                if(nx < 0 || ny < 0 || nx >= m || ny >= n)
                    continue;
                char cell = classroom[nx].charAt(ny);
                if(cell == 'X')
                    continue;

                if(curr.energyLeft == 0)
                    continue;

                int nextEnergy = curr.energyLeft - 1;
                int nextMask = curr.mask;

                if(cell == 'R')
                    nextEnergy = energy;

                if(cell == 'L') {
                    int idx = litterIndex[nx][ny];
                    nextMask |= (1 << idx);
                }
                if(!visited[nx][ny][nextEnergy][nextMask]) {
                    visited[nx][ny][nextEnergy][nextMask] = true;
                    queue.offer(new State(nx, ny, nextEnergy, nextMask, curr.moves + 1));
                }
            }
        }
        return -1;
    }
}
