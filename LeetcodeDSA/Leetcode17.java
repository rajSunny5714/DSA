package LeetcodeDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digit: ");
        String d = sc.next();
        System.out.println("Output: "+letterCombinations(d));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0)
            return result;
        String[] mapping = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        backtrack(0, digits, new StringBuilder(), mapping, result);
        return result;
    }
    public static void backtrack(int index, String digits, StringBuilder current,
                                 String[] mapping, List<String> result) {

        if(index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for(char c : letters.toCharArray()) {
            current.append(c);
            backtrack(index + 1, digits, current, mapping, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
