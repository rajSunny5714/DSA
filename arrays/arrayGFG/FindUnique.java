package arrays.arrayGFG;
import java.util.*;

public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                if(arr[i] != arr[i+1]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
            else if(i == n - 1) {
                if(arr[i] != arr[i-1]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
            else {
                if(arr[i] != arr[i-1] && arr[i] != arr[i+1]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}