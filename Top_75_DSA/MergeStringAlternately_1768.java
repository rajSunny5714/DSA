package Top_75_DSA;

import java.util.Scanner;

public class MergeStringAlternately_1768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both string:");
        String word1 = sc.next();
        String word2 = sc.next();

        MergeStringAlternately_1768 obj = new MergeStringAlternately_1768();
        String result = obj.mergeAlternately(word1, word2);
        System.out.println("Merged String: " +result);
    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while(i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        while(i < word1.length()) {
            result.append(word1.charAt(i++));
        }
        while(j < word2.length()) {
            result.append(word2.charAt(j++));
        }
        return result.toString();
    }
}
