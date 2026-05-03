package arrays.arrayGFG;

import java.util.*;
public class LeaderInArr {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int max = arr[arr.length - 1];
        res.add(max);
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] >= max) {
                max = arr[i];
                res.add(max);
            }
        }

        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> result = leaders(arr);

        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}
