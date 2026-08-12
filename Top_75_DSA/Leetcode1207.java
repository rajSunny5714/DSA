package Top_75_DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Leetcode1207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int frequency : map.values()) {
            if(!set.add(frequency)) {
                return false;
            }
        }
        return true;
    }
}
