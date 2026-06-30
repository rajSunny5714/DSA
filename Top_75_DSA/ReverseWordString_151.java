package Top_75_DSA;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordString_151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ReverseWordString_151 obj = new ReverseWordString_151();
        String result = obj.reverseWords(s);
        System.out.println(result);
    }
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        for(String word : s.trim().split("\\s+")) {
            stack.push(word);
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) {
            ans.append(stack.pop());
            if (!stack.isEmpty()) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
