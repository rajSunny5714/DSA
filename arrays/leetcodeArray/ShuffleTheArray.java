package arrays.leetcodeArray;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = size/2;
        int[] result = shuffle(arr, n);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] shuffle(int[] arr, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = arr[i];
            result[index++] = arr[i + n];
        }
        return result;
    }
}